package basic.integer;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class test {

    public static void main(String[] args) {

        Integer a = 100, b = 100, c = 666, d = 666;
        System.out.println(a == b);
        System.out.println(c.equals(d));
        System.gc();
        System.out.println("\nAfter GC");
        System.out.println("a:" + getAddresses(a));
        System.out.println("b:" + getAddresses(b));
        System.out.println("c:" + getAddresses(c));
        System.out.println("d:" + getAddresses(d));
    }

    /**
     * 获取对象地址
     * @param objects
     * @return
     */
    public static String getAddresses(Object... objects)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("0x");
        // sun.arch.data.model=32 // 32 bit JVM
        // sun.arch.data.model=64 // 64 bit JVM
        boolean is64bit = Integer.parseInt(System.getProperty("sun.arch.data.model")) == 32 ? false : true;
        Unsafe unsafe = getUnsafe();
        long last = 0;
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale)
        {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
                // 输出指针地址
                sb.append(Long.toHexString(i1));
                last = i1;
                for (int i = 1; i < objects.length; i++)
                {
                    final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
                    if (i2 > last)
                        sb.append(", +" + Long.toHexString(i2 - last));
                    else
                        sb.append(", -" + Long.toHexString(last - i2));
                    last = i2;
                }
                break;
            case 8:
                throw new AssertionError("Not supported");
        }
        return sb.toString();
    }

    private static Unsafe getUnsafe()
    {
        try
        {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            return (Unsafe) theUnsafe.get(null);
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }
}

package com.proxy.scan;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/21
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class ScanTest {

    public static void main(String[] args){
        System.out.println("START");
        a: {
            for (int i = 0; i < 10; i++ ) {
                System.out.println("START-" + i + "---------------");
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        System.out.println(k);
                        if (k == 3) {
                            break a;
                        }
                    }

                }
                System.out.println("END-" + i + "---------------");
            }
        }
        System.out.println("END");
    }
}

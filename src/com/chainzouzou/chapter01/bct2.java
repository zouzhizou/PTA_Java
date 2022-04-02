package com.chainzouzou.chapter01;

import java.util.Scanner;

public class bct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Demo1 d = new Demo1();
            d.flow(sc.nextLine());
        }
        sc.close();//关闭输入流。
    }
}
class Demo1 {

    void flow(String s) {
        int sum = 0;
        if (Integer.parseInt(s) >= 10000 && Integer.parseInt(s) <= 20000) {
            //将字符串参数作为有符号的十进制整数进行分析
            System.out.print(Integer.toBinaryString(Integer.parseInt(s))//二转十
                    + "," + Integer.toOctalString(Integer.parseInt(s))//八转十
                    + "," + Integer.toHexString(Integer.parseInt(s)));//十六转十
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') {
                    continue;
                }
                sum += (int) (s.charAt(i) - 48);//charAt返回索引处的char值
                System.out.print(s.charAt(i) + " ");
                if (i == s.length() - 1) {
                    System.out.print(sum);
                }
            }
        }
        System.out.println();
    }
}

package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(getDate(m));
    }





//public class LocalDateUtils {
    /**
     * 转换秒为时分秒的形式
     *
     * @param seconds 待转换的秒
     * @return
     */
    public static String getDate(Integer seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = (seconds % 3600) % 60;
        return h + "小时" + m + "分" + s + "秒";
    }
}











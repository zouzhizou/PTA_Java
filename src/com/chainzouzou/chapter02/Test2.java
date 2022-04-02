package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d + %d = %d",a,b,a+b);
        System.out.println();
        System.out.printf("%d - %d = %d",a,b,a-b);
        System.out.println();
        System.out.printf("%d * %d = %d",a,b,a*b);
        System.out.println();
        System.out.printf("%d / %d = %d",a,b,a/b);
    }
}

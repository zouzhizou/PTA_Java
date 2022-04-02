package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ff = sc.nextDouble();
        int n = sc.nextInt();
        System.out.printf("你好，可以借我%.2f元钱吗？",ff);
        System.out.println();
        System.out.printf("%d天后一定还！",n);
    }
}

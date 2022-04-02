package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double aver = (a + b + c) * 1.0 / 3;
        System.out.printf("aver=%.6f",aver);
    }
}

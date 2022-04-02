package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int child = n / 4;
        int number = n % 4;
        System.out.printf("%d,%d",child,number);
    }
}

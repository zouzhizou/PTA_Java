package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;
        System.out.printf("%d,%d,%d",a,b,c);
    }
}

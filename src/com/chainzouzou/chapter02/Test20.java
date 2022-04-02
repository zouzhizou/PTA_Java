package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a * a + b*b;
        System.out.printf("%.6f",c);
    }
}

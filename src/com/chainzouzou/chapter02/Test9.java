package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = 5*1.0 * (f - 32) / 9;
        System.out.printf("%.2f",c);//符号只有f
    }
}

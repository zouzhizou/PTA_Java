package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int number = sc.nextInt();
        Double dd = sc.nextDouble();
        System.out.println(ch);
        System.out.println(number);
        System.out.printf("%.6f",dd);
    }
}

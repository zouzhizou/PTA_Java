package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        if(m >= 1 && n <= 1000)
        {
            int sum = m * n;
            System.out.println(sum);
        }
    }
}

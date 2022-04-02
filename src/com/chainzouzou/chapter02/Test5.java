package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(1 <= n && n <= 1000)
        {
            int b = 2*n;
            System.out.println(b);
        }
    }
}

package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        if(k <= 100 && k >= 0)
        {
            System.out.printf("My score is %.2f\n",k);
        }
    }
}

package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100,50,20,10,5,2,1};
        int money = sc.nextInt();
        int cnt,n;
        for (int i = 0; i < 7; i++) {
            cnt = money / arr[i];
            money = money % arr[i];
            n = (int)Math.log10(arr[i]*10);
            for (;n < 3;n++)
            {
                System.out.printf(" ");
            }
            System.out.printf("%d元:%3d张\n" ,arr[i],cnt);
        }
    }
}

package com.chainzouzou.chapter02;


import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] str = new int[3];
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextInt();
            sum += str[i];
        }
        System.out.println("sum="+sum);

//        for (int i = 2; i >= 0 ; i--) {
//            System.out.printf("%d",str[i]);
//            System.out.print(" ");
//        }
    }
}
//import java.util.Scanner;
//
//public class Main{undefined
//
//    public static void main(String[] args) {undefined
//
//        Scanner src=new Scanner(System.in);
//
//        int str[]=new int[3];
//
//        for(int i=0;i<3;i++){undefined
//
//            str[i]=src.nextInt();
//
//        }
//
//        Arrays.sort(str);
//
//        for(int i=2;i>=0;i--){undefined
//
//            System.out.printf("%d",str[i]);
//
//            System.out.printf(" ");
//        }
//    }
//}

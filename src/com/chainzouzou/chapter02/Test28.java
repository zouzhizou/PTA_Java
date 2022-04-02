package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float m = y / x;
        if(n < m){
            System.out.println("0");
        }else{
            System.out.println((int)(n-m));
        }
    }
}



//    int n;
//    float x,y,m;
//    Scanner scan = new Scanner(System.in);
//        n=scan.nextInt();		//苹果的个数，输入数据类型均为整形
//                x=scan.nextInt();		//虫子每小时吃掉苹果的个数
//                y=scan.nextInt();		//经过时间
//                //计算虫子吃掉了多少个苹果，因为要约分，所以这里的数据类型为浮点型
//                m =  y/x;
//                if (n<m) {
//        System.out.println("0");
//        }
//        else {
//        //因为要求值为整数，这里使用到了强制类型转换
//        System.out.println((int)(n-m));
//        }
//        }
//        }
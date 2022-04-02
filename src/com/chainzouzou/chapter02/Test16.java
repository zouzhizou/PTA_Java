package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String ch1 = sc.next();
//        char ch = ch1.charAt(0);
        char ch = sc.next().charAt(0);
        ch += 32;
        System.out.println(ch);
    }
}
/*String s=input.next();
char c=s.charAt(0);
这样可以转成char的，但是要保证你当时输入的就是char的类型

要从输入中读取字符，可以使用内置函数char charAt():

char c = sc.next().charAt(0)*/
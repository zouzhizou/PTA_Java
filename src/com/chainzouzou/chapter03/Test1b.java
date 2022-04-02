package com.chainzouzou.chapter03;

import java.util.Scanner;
public class Test1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person1[] p = new Person1[n];
        for (int i = 0; i < p.length; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            boolean genter = sc.nextBoolean();
            p[i] = new Person1(name,age,genter);
        }
        for (int i = p.length - 1; i >= 0 ; i--) {
            p[i].toString();
        }
        new Person1();
    }
}
class Person1
{
    private String name;
    private int age;
    private boolean gender;
    private int id;
    Person1(){
        System.out.println("This is constructor");
        System.out.println(name+","+age+","+gender+","+id);
        System.out.println("Person [name="+name+", age="+age+", gender="+gender+", id="+id+"]");
    }

    public Person1(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
    public String toString(){
        System.out.println("Person [name="+this.name+", age="+this.age+", gender="+this.gender+", id="+0+"]");
        return "1";
    }
}

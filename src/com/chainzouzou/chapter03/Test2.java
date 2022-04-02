package com.chainzouzou.chapter03;

import java.util.Scanner;

public class Test2 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Person3[] people = new Person3[n];

        for (int i = 0; i < n; i++) {

            Person3 person = new Person3(scanner.next(), scanner.nextInt(), scanner.nextBoolean());
            people[i] = person;
        }

        //逆序输出
        for (int i = n-1; i >= 0; i--) {
            System.out.println(people[i]);
        }

        System.out.println(new Person3());

    }
}


class Person3 {

    private String name;
    private boolean gender;
    private int age;
    private int id;
    private static int idValue = 0;

    Person3() {
        System.out.println("This is constructor");
        System.out.println(name + "," + age + "," + gender + "," + id);
    }

    Person3(String name, int age, boolean gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    {
        this.id = idValue++;
        System.out.println("This is initialization block, id is " + this.id);
    }

    static {
        System.out.println("This is static initialization block");
    }

    @Override
    public String toString() {//固定语法
        //使用toString函数，返回对象本身，由于是String类型所以返回值应该也是String类型
        return "Person [" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ']';
    }
}
/*体会构造函数、初始化块、静态初始化块的执行顺序和适用场景。
注意：使用无参构造器时，好像还需要直接打印各自的值，题目上没有说清楚，
但是是会检测，所以要加上。（也就是本文代码的第45行）*/

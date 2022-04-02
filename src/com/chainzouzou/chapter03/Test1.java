package com.chainzouzou.chapter03;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int n=i.nextInt();//创建对象个数
        Person p[] = new Person[n];    //初始化对象数组
        for(int x=0; x<p.length; x++) {    //通过循环输入
            String name = i.next();//字符型，next（）或者nextLine
            int age = i.nextInt();
            boolean genter = i.nextBoolean();
            p[x] = new Person(name,age,genter);
        }
        for(int y=p.length-1; y>=0;y--){  //逆序输出
            p[y].toString();
        }
        new Person();//

    }

}
class Person
{
    private String name = null;
    private int age = 0;
    private boolean gender = false;
    private int id = 0;//根据题目，变量必须是private，私有的，赋初值string是null，int是0，bool是false
    //编写无参构造函数，构造函数和构造方法是同一概念
    Person()
    {
        System.out.println("This is constructor");
        //将name,age,gender,id按照name,age,gender,id格式输出
        System.out.println(name+","+age+","+gender+","+id);
        System.out.println("Person [name="+name+", age="+age+", gender="+gender+", id="+id+"]");//按照格式输出
    }
    //构造有参函数对name,age,gender赋值，
    Person(String name,int age,Boolean gender)
    {
        this.name=name;
        this.age=age;//前面定义的域与当前局部变量同名，必须用this，否则访问不到域name，age等，this指当前对象名
        this.gender=gender;
    }


    public String toString()//固定语法
    {      //使用tostring函数，类名 [name=, age=, gender=, id=]输出。    返回对象本身,因为是string类型，所以返回值应该是string类型
        System.out.println("Person [name="+this.name+", age="+this.age+", gender="+this.gender+", id="+0+"]");
        return "1";//反正return一个字符串就行
    }
}

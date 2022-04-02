package com.chainzouzou.chapter04.nihao;
import java.util.Arrays;
import java.util.Scanner;
    abstract class Shape{
        //不可变静态常量double PI，值为3.14
        public static final double PI = 3.14;
        //抽象方法:public double getPerimeter(),public double getArea()
        public abstract double getPerimeter();
        public abstract double getArea();
    }
    class Rectangle extends Shape{
        int width,length;
        public Rectangle(int width,int length){
            super();
            this.width = width;
            this.length = length;
        }
        @Override
        public String toString() {
            return "Rectangle [width=" + width + ", length=" + length + "]";
        }
        @Override
        public double getPerimeter() {
            return 2*(width+length);
        }
        @Override
        public double getArea() {
            return width*length;
        }
    }
    class Circle extends Shape{
        int radius;
        public  Circle(int radius){
            super();
            this.radius = radius;
        }
        @Override
        public String toString() {
            return "Circle [radius=" + radius + "]";
        }
        @Override
        public double getPerimeter() {
            return 2*PI*radius;
        }
        @Override
        public double getArea() {
            return PI*radius*radius;
        }
    }
    public class TestCopy{
        public static  void main(String e[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Shape a[] = new Shape[n];
            for(int i = 0;i < a.length;i++){
                String s = sc.next();
                if(sc.equals("rect")){
                    a[i]=new Rectangle(sc.nextInt(),sc.nextInt());
                }else {
                    a[i]=new Circle(sc.nextInt());
                }
            }
            System.out.println(sumAllPerimeter(a));
            System.out.println(sumAllArea(a));
            System.out.println(Arrays.toString(a));
            for(int i=0;i<a.length;i++) {
                System.out.println(a[i].getClass()+","+a[i].getClass().getSuperclass());
            }
        }

        public static double sumAllArea(Shape a[]){
            double t = 0;
            for(int i = 0;i < a.length;i++){
                if(a[i] instanceof Rectangle){
                    t = t + ((Rectangle)a[i]).getArea();
                }else{
                    t = t+ ((Circle)a[i]).getArea();
                }
            }
            return t;
        }
        public static double sumAllPerimeter(Shape a[]){
            double t=0;
            for(int i=0;i<a.length;i++) {
                if(a[i] instanceof Rectangle) {
                    t=t+((Rectangle)a[i]).getPerimeter();
                }else {
                    t=t+((Circle)a[i]).getPerimeter();
                }
            }
            return t;
        }
    }


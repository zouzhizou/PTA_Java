package com.chainzouzou.chapter04;
import java.util.Arrays;
import java.util.Scanner;
abstract class Shape{
    public  final static double PI=3.14;
    public abstract double getPerimeter();// 周长;
    public abstract double getArea();
}
class Rectangle extends Shape{//长方形或者矩形
    int width,length;

    public Rectangle(int width, int length) {//有参构造
        super();
        this.width= width;
        this.length = length;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
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
class  Circle extends Shape{
    int radius;//半径

    public Circle(int radius) {
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
public class Test4 {
    public static void main(String e[]) {
        Scanner se=new Scanner (System.in);
        int n=se.nextInt();
        Shape a[]=new Shape[n];
        for(int i=0;i<a.length;i++) {
            String s=se.next();
            if(s.equals("rect")) {
                a[i]=new Rectangle(se.nextInt(),se.nextInt());
            }else {
                a[i]=new Circle(se.nextInt());
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
        double t=0;
        for(int i=0;i<a.length;i++) {
            if(a[i] instanceof Rectangle) {
                t=t+((Rectangle)a[i]).getArea();
            }else {
                t=t+((Circle)a[i]).getArea();
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


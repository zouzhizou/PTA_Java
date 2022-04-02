package com.chainzouzou.chapter03;

import java.util.Arrays;
import java.util.Scanner;

class Rectangle1{
    private int width;
    private int length;

    public Rectangle1(int width,int length){
        this.width = width;
        this.length = length;
    }
    //求周长方法
    public int getPerimeter() {
        return 2*(width+length);
    }
    //求面积方法
    public int getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
class Circle1{
    private int radius;
    public Circle1(int radius){
        this.radius = radius;
    }
    //求周长
    public int getPerimeter(){
        return (int)(2 * Math.PI*radius);
    }
    //求面积
    public int getArea(){
       return (int)(Math.PI*radius*radius);
    }
    @Override
    public String toString(){
        return "Circle [radius=" + radius + "]";
    }
}
public class Test3b {
    public static void main(String[] args) {
        Rectangle1[] rectangle = new Rectangle1[2];
        Circle1[] circle = new Circle1[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rectangle.length; i++) {
            rectangle[i] = new Rectangle1(sc.nextInt(),sc.nextInt());
        }
        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle1(sc.nextInt());
        }
        System.out.println(rectangle[0].getPerimeter()+rectangle[1].getPerimeter()+
                circle[0].getPerimeter()+circle[1].getPerimeter());
        System.out.println(rectangle[0].getArea()+rectangle[1].getArea()+
                circle[0].getArea()+circle[1].getArea());
        System.out.println(Arrays.deepToString(rectangle));
        System.out.println(Arrays.deepToString(circle));
        sc.close();
    }
}

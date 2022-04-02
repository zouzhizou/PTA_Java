package com.chainzouzou.chapter03;
import java.util.Arrays;
import java.util.Scanner;
public class Test3 {

        public static void main(String[] args) {
            Rectangle[] rectangle = new Rectangle[2];
            Circle[] circle = new Circle[2];
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<rectangle.length;i++) {
                rectangle[i] = new Rectangle(sc.nextInt(),sc.nextInt());
            }
            for(int i=0;i<circle.length;i++) {
                circle[i] = new Circle(sc.nextInt());
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


    class Rectangle{
        private int width;
        private int length;

        public Rectangle(int width,int length) {
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


    class Circle{
        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        //求周长方法
        public int getPerimeter() {
            return (int)(2*Math.PI*radius);
        }
        //求面积方法
        public int getArea() {
            return (int)(Math.PI*radius*radius);
        }

        @Override
        public String toString() {
            return "Circle [radius=" + radius + "]";
        }

    }



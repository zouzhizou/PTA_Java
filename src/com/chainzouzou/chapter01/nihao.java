package com.chainzouzou.chapter01;

import java.util.Scanner;

public class nihao {
        public static void main(String args[]){
            String lei;
            Scanner sc=new Scanner(System.in);
            while(true){
                lei=sc.nextLine();
                if(lei.equals("double")){
                    double[]  dou=new double[3];
                    for(int i=0;i<3;i++){ dou[i]=sc.nextDouble();}
                    System.out.printf("choice=%s\n",lei);
                    System.out.printf("%-5.2f,%5.2f,%.2f\n",dou[0],dou[1],dou[2]);
                    sc.nextLine();
                }
                else  if(lei.equals("int")) {
                    int sum=0;
                    for(int i=0;i<3;i++)  {sum+=sc.nextInt();}
                    System.out.printf("choice=%s\n",lei);
                    System.out.printf("%d\n",sum);
                    sc.nextLine();
                }
                else if(lei.equals("str")){
                    String str;
                    str=sc.next();
                    str=sc.next()+str;
                    str=sc.next()+str;
                    System.out.printf("choice=%s\n",lei);
                    System.out.println(str);
                    sc.nextLine();
                }
                else if(lei.equals("line")){
                    String str;
                    str=sc.nextLine();
                    str=str.toUpperCase();
                    System.out.printf("choice=%s\n",lei);
                    System.out.println(str);
                }
                else{
                    System.out.printf("choice=%s\n",lei);
                    System.out.println("other");
                }
            }
        }
    }


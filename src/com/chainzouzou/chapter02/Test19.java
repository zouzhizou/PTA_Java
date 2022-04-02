package com.chainzouzou.chapter02;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int foot = (int)((cm/ 100.0/0.3048));
        int inch = (int)(((cm / 100.0/0.3048)-foot) * 12);
        System.out.printf("%d %d",foot,inch);
    }
}



    /*1英尺等于12英寸
    (foot+inch/12)×0.3048 == 英尺 * 0.3048  == meter
    即   英尺 == meter /0.3048;
        而英尺又由两部分组成(foot+inch/12) 整数部分的foot 以及小数部分的 (inch/12)
        所以 meter /0.3048 取整即为 foot
         meter /0.3048 - foot 即为小数部分 inch/12  即小数部分为 12 *(meter /0.3048 - foot);
    */
//        int cm=0;
//        scanf("%d",&cm);    //输入的cm
//        int foot = cm/100.0/0.3048;  /* 1英尺等于30.48厘米 */
//        int inch = (cm/100.0/0.3048 - foot) * 12;
//        printf("%d %d",foot,inch);
//        return 0;
//        }
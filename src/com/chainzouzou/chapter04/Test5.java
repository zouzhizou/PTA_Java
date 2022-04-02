package com.chainzouzou.chapter04;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        PersonOverride[] person1 = new PersonOverride[n1];
        for (int i = 0; i < n1; i++) {
            person1[i] = new PersonOverride();
        }
        int n2 = sc.nextInt();
        PersonOverride[] person2 = new PersonOverride[n2];
        int count = 0;
        PersonOverride p =null;
        for (int i = 0; i < n2; i++) {
            p = new PersonOverride(sc.next(),sc.nextInt(),sc.nextBoolean());
            int j = 0;
            while(j < count){
                if(p.equals(person2[j])){
                    break;
                }
                j++;
            }
            if(j >= count){
                person2[count] = p;
                count++;
            }
        }
        sc.close();
        for (int i = 0; i < n1; i++) {
            System.out.println(person1[i].toString());
        }
        for (int i = 0; i < count; i++) {
            System.out.println(person2[i].toString());
        }
        System.out.println(count);
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}
class PersonOverride{
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride() {
        this("default",1,true );
    }

    public PersonOverride(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        PersonOverride that = (PersonOverride) o;
        return age == that.age && gender == that.gender && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

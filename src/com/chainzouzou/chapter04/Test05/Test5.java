package com.chainzouzou.chapter04.Test05;

import java.util.Arrays;
import java.util.Scanner;
/*关于这个题目的思路，我们按部就班，建立PersonOverride类，无参构造函数用this调用有参构造函数，toString和equals方法直接用source里面的toString和Hash and equals方法自动生成。
主方法中，比较难的一点就是2.2，我们可以定义一个int变量count，count就是person2数组中的实际对象数量，在for大循环下new一个p对象，然后int一个j=0，用while循环判断p在person2中是否存在，如果不存在就放入，存在就跳出循环。
2.4 2.5要注意输出的时候用count进行for循环，2.5中输出的也是count的值
2.6直接复制粘贴就OK
*/
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int i;
        PersonOverride person1[] = new PersonOverride[n1];
        for (i = 0; i < n1; i++) {
            person1[i] = new PersonOverride();
        }
        int n2 = in.nextInt();
        PersonOverride person2[] = new PersonOverride[n2];
        int count=0;
        PersonOverride p = null;
        for (i = 0; i < n2; i++) {
            p = new PersonOverride(in.next(), in.nextInt(), in.nextBoolean());
            int j = 0;
            while (j < count) {
                if (p.equals(person2[j]))
                {  break;}
                j++;
            }
            if (j >= count) {
                person2[count] = p;
                count++;
            }
        }
        in.close();
        for(i=0;i<n1;i++)
        {
            System.out.println(person1[i].toString());
        }
        for (i = 0; i < count; i++) {
            System.out.println(person2[i].toString());
        }
        System.out.println(count);
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}
//1. 新建PersonOverride类
class PersonOverride {
    //a. 属性：String name、int age、boolean gender，所有的变量必须为私有(private)。
    private String name;
    private int age;
    private boolean gender;
    //c. 无参构造方法，使用this(name, age,gender)调用有参构造函数。参数值分别为"default",1,true
    public PersonOverride() {
        this("default", 1, true);
    }
    //b. 有参构造方法，参数为name, age, gender
    public PersonOverride(String name, int age, boolean gender) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    @Override
    //d.toString()方法返回格式为：name-age-gender
    public String toString() {
        return name + "-" + age + "-"+ gender;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + (gender ? 1231 : 1237);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    //e. equals方法需比较name、age、gender，这三者内容都相同，才返回true.
    public boolean equals(Object obj) {
        if (this == obj)
        {  return true;}
        if (obj == null)
        {  return false;}
        if (getClass() != obj.getClass())
        /*这是重写equals的方法里面的吧？用于判断对象是否相等。
        上面的代码就是用来优化的，如果一只猫对象和狗对象比较，这是完全没有意义的（浪费时间），
        所以代码表达的就是，对象和对象的比较，只限于当前类的对象。
        如果两个对象不是当前类创建出来的对象，就没必要比较了
        getClass生成的是字节码文件对象*/
        {   return false;}
        PersonOverride other = (PersonOverride) obj;
        if (age != other.age)
        {  return false;}
        if (gender != other.gender)
        {  return false;}
        if (name == null) {
            if (other.name != null)
            {  return false;}
        } else if (!name.equals(other.name))
        { return false;}
        return true;
    }

}



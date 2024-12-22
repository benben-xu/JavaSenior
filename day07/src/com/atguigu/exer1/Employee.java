package com.atguigu.exer1;

/**
 * 定义一个Employee类。
 * 该类包含：private成员变量name,age,birthdaym,其中birthday为MyDate类的成员；
 * 并为每一个属性定义getter,setter方法；
 * 并重写toString方法输出name,age,birthday
 *
 * @author JiaMing_Xu
 * @create 2024-12-21-23:21
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("传入的类型不一致！");
    }
}

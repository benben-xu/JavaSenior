package com.atguigu.java1;

import java.util.Objects;

/**
 * @author JiaMing_Xu
 * @create 2024-12-16-20:36
 */
public class User implements Comparable{
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o){
        if (o instanceof User){
            User u = (User) o;
            int compare = this.name.compareTo(u.name);
            if (compare != 0){
                return compare;
            }else {
                return Integer.compare(this.age, u.age);
            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}

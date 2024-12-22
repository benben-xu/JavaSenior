package com.atguigu.exer1;

/**
 * MyDate类包含：
 * private成员变量year,month,day;并为每一个属性定义getter,setter方法
 *
 * @author JiaMing_Xu
 * @create 2024-12-21-23:16
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {

    }

}

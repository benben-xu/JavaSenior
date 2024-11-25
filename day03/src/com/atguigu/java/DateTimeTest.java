package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author JiaMing_Xu
 * @create 2024-11-25-11:55
 */
public class DateTimeTest {

    /*
    java.util.Data类
            |---java.sql.Date类
    1. 两个构造器的使用
        >构造器一：Date()：创建了一个对应当前时间的Date对象。
        >构造器二：创建指定时间戳的Date对象
    2. 两个方法的使用
        >toString():显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对应的时间戳。
    3. java.sql.Date对应着数据库中的日期类型变量
        >如何实例化
        >如何将java.util.Date对象转换为java.sql.Date对象
     */
    @Test
    public void test2() {
        //构造器一：Date()：创建了一个对应当前时间的Date对象。
        Date date1 = new Date();
        System.out.println(date1.toString());//Mon Nov 25 12:13:14 SGT 2024
        System.out.println(date1.getTime());

        //构造器二：创建指定时间戳的Date对象
        Date date2 = new Date(1550306204104L);
        System.out.println(date2.toString());

        //创java.sql.Date对象
        Date date3 = new java.sql.Date(1550306204104L);
        System.out.println(date3);
        System.out.println(date3.toString());
        System.out.println(date3.getTime());

        //如何将java.util.Date对象转换为java.sql.Date对象
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());

    }
    //1. System类中的currentTimeMillis()
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        System.out.println(time);
    }
}

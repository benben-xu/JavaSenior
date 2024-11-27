package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * jdk 8之前的日期时间的API测试
 * 1. System类中currentTimeMills();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleFDateFormat
 * 4. Calendar
 *
 * @author JiaMing_Xu
 * @create 2024-11-27-15:05
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1. 两个操作
    1.1 格式化： 日期 --->字符串
    1.2 解析：格式化的逆过程，字符串 --->日期

    2. SimpleDateFormat的实例化


     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期 --->字符串
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程，字符串 --->日期
        String str = "2024/11/27 下午4:19";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //******************按照指定的方式格式化和解析：调用带参的构造器
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析：要求字符串必须是符合SimpleDateFormat识别的格式（通过构造器参数体现）

    }
}

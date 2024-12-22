package com.atguigu.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的5个对象，并把这些对象放入TreeSet集合中（下一章：TreeSet需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 * 1) 使用Employee实现Comparable接口，并按name排序
 * 2) 创建TreeSet时传入Comparator对象，按生日日期的先后排序。
 *
 * @author JiaMing_Xu
 * @create 2024-12-21-23:24
 */
public class EmployeeTest {

    //问题一：使用自然排序
    @Test
    public void test1() {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3 = new Employee("guafucheng",44,new MyDate(1987,5,9));
        Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    @Test
    public void test2() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                MyDate b1 = e1.getBirthday();
                MyDate b2 = e2.getBirthday();
                int minusYear = b1.getYear() - b2.getYear();
                if(minusYear != 0){
                    return minusYear;
                }
                int minusMonth = b1.getMonth() - b2.getMonth();
                if(minusMonth != 0){
                    return minusMonth;
                }
                int minusDay = b1.getDay() - b2.getDay();
                if(minusDay != 0){
                    return minusDay;
                }
                return 0;
            }
        });
        Employee e1 = new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3 = new Employee("guafucheng",44,new MyDate(1987,5,4));
        Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}

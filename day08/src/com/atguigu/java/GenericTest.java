package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 泛型的使用
 * 1.jdk5.0新增的特性
 *
 * 2.在集合中使用泛型：
 * 总结：
 * ① 集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 * ② 在实例化集合类时，可以指明具体的泛型类型
 * ③ 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构使用到类的泛型的位置，都指定为实例化时的泛型类型
 * ④ 注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
 * ⑤ 如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型
 *
 *
 * @author JiaMing_Xu
 * @create 2024-12-25-07:14
 */
public class GenericTest {


    //在集合中使用泛型之前的情况
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //问题一：类型不安全
        list.add("Tom");

        for (Object score : list) {
            //问题二：强转时，可能出现classCastException
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }

    }

    //在集合中使用泛型的情况：
    @Test
    public void test2() {
        //jdk7新增了类型判断
        ArrayList<Integer> list = new ArrayList();
//        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //编译时，就会进行类型检查，保证数据的安全
//        list.add(Integer.valueOf("Tom"));
        for (Integer score : list) {
            //避免了强转操作
            System.out.println(score);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom", 1);
        map.put("Jack", 2);
        map.put("Jill", 3);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());


        }
    }

}

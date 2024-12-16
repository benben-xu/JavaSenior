package com.atguigu.java1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Set接口的框架：
 * |-----Collection接口：单列集合，用于存储一个一个的对象
 *          |-----Set接口：存储无序的、不可重复的数据 --->高中讲的“集合”
 *               |-----HashSet：作为Set接口的主要实现类；线程不安全的；可以存储null值
 *                  |-----LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
 *               |-----TreeSet：可以按照添加对象的指定属性，进行排序。
 *
 *  Set接口中没有额外定义新的方法，使用的都是Collection中声明过的方法。
 *
 * @author JiaMing_Xu
 * @create 2024-12-16-20:17
 */
public class SetTest {
    /*
    一、Set：存储无序的、不可重复的数据
    以HashSet为例说明：
    1. 无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的。

    2. 不可重复性：保证添加的元素按照equals()判断时，不能返回true。相同的元素只能添加一个。

    二、添加元素的过程：以HashSet为例：
     */
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom",20));
        set.add(new User("Tom",20));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * |-----Map:双列数据，存储key-value对的数据  ---类似高中的函数：y = f(x)
 *          |-----HashMap:作为Map的主要实现类；线程不安全的，效率高；存储null的key和value
 *              |-----LinkedHashMap:保证在遍历map元素时，可以按照添加添加的顺序实现遍历。
 *                          原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
 *                          对于频繁的遍历操作，此类执行效率高于HashMap。
 *          |-----TreeMap:保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或定制排序。
 *                          底层使用红黑树
 *          |-----Hashtable:作为古老的实现类；线程安全的，效率低；不能存储null的key和value
 *              |-----Properties:常用来处理配置文件。key和value都是String类型
 *
 *
 *          HashMap的底层：数组 + 链表 （jdk7之前）
 *                       数组 + 链表 + 红黑树 （jdk8）
 *
 * 面试题：
 * 1. HashMap的底层实现原理？
 * 2. HashMap和Hashtable的异同？
 * 3. CurrentHashMap与Hashtable的异同？
 *
 * 二、Map结构的理解：
 * Map中的key：无序的、不可重复的，使用Set存储所有的key   ---> key所在的类要重写equals()和hashCode()
 * Map中的value：无序的、可重复的，使用Collection存储所有的value   ---> vaule所在的类要重写euqals()
 * 一个键值对：key-value构成了一个Entry对象。
 * Map中的entry：无序的、不可重复的，使用Set存储所有的entry
 *
 * 三、HashMap的底层实现原理？
 *
 * @author JiaMing_Xu
 * @create 2024-12-22-13:39
 */
public class MapTest {

    @Test
    public void test() {
        Map map = new LinkedHashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");
        System.out.println(map);
    }

    @Test
    public void test1() {
        Map map = new HashMap();
        map = new Hashtable();
        map.put(1, 1223);

    }

    /*
       添加、删除、修改操作：
       Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
       void putAll(Map m):将m中所有key-value对存放到当前map中
       Object remove(Object key):移除指定key-value对，并返回value
       void clear():清空当前map中的所有数据
        */
    @Test
    public void test3() {
       Map map = new HashMap();
       map.put("AA",123);
       map.put(45,123);
       map.put("BB",56);
       map.put("AA",87);
       System.out.println(map);

       Map map1 = new HashMap();
       map1.put("CC",123);
       map1.put("DD",123);
       map.putAll(map1);
       System.out.println(map);

       Object value = map.remove("CC");
       System.out.println(value);
       System.out.println(map);

       System.out.println(map.size());
       map.clear();
       System.out.println(map.size());
       System.out.println(map);

    }


    /*
    元素查询的操作：
    Object get(Object key):获取指定key对应的value
    boolean containsKey(Object key):是否包含指定的key
    boolean containsValue(Object value):是否包含指定的value
    int size():返回map中的key-value对的个数
    boolean isEmpty():判断当前map是否为空
    boolean equals(Object obj):判断当前map和参数对象obj是否相等
     */
    @Test
    public void test4() {
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        System.out.println(map.get(1));
        System.out.println(map.containsKey("BB"));
        System.out.println(map.containsValue(123));
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

    }

    /*
    元视图操作的方法：
    Set keySet():返回所有key构成的Set集合
    Collection values():返回所有value构成的Collection集合
    Set entrySet():返回所有key-value对构成的Set集合
     */
    @Test
    public void test5() {
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        //遍历所有的key集:keySet()
        Set set = map.keySet();
        for(Object key : set){
            System.out.println(key);
        }

        System.out.println("\n");
        //遍历所有的value集:values()
        Collection values = map.values();
        values.forEach(System.out::println);

        System.out.println("\n");

        //遍历所有的key-value:entrySet()
        Set entrySet = map.entrySet();
        entrySet.forEach(System.out::println);
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

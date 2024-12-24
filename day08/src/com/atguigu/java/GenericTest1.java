package com.atguigu.java;

import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;

/** 如何自定义泛型结构：泛型类、泛型接口；泛型方法。
 *
 *
 * @author JiaMing_Xu
 * @create 2024-12-27-08:52
 */
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型。
        Order order = new Order();

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<>("OrderAA",1001,"AA");
        order1.setOrderT("AA:Hello");


    }

    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        subOrder.setOrderT(111);
    }

    @Test
    public void test3(){
        //泛型不同的引用不能相互赋值。
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
//        list2 = list1;

    }

}

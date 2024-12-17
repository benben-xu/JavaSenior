package com.atguigu.java1;

import com.atguigu.java.Person;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest  {

    /*
    1. 向TreeSet中添加的数据，要求是相同类的对象。


     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        //失败：不能添加不同类的对象：
//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new Person("Tom",20));

        //举例一：
//        set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(11);
//        set.add(8);

        //举例二：
        set.add(new User("Tom",12));
        set.add(new User("Jerrry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }

}

package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author JiaMing_Xu
 * @create 2024-12-21-21:07
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);

        coll.forEach(System.out::println);

    }

}

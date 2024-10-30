package com.atguigu.exer;

/**
 * 一道面试题：
 * @author JiaMing_Xu
 * @create 2024-10-30-14:08
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");//good and
        System.out.println(ex.ch);//best
    }
}

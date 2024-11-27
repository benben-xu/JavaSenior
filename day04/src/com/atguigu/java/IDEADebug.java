package com.atguigu.java;

import org.junit.Test;

/**
 * @author JiaMing_Xu
 * @create 2024-11-27-14:26
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer() ;
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//"null"
        StringBuffer sb1 = new StringBuffer(str);//NullPointerException
        System.out.println(sb1);

    }
}

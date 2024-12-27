package com.atguigu.java3;

import org.junit.Test;

import java.io.File;

/**
 *
 * File类的使用
 *
 * 1. File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2. File类声明在java.io包下
 *
 *
 *
 * @author JiaMing_Xu
 * @create 2024-12-30-19:22
 */
public class FileTest {
    /*
    如何创建File类的实例

     */
    @Test
    public void test1() {
        File file = new File("D:\\workspace_idea1\\JavaSenior");
        String[] list = file.list();
        for (String str : list) {
            System.out.println(str);
        }
    }

    /*
    public boolean renameTo(File dest):把文件重命名为指定的文件路劲
    比如：file1.renameTo(file2)
        要想保证返回true，需要file1在硬盘中是存在的，且file2不能在硬盘中存在。
     */

    @Test
    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("hi1.txt");

        boolean renameTo = file1.renameTo(file2);
        System.out.println(renameTo);
    }

}

package com.atguigu.java;

import org.junit.Test;

/**
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2.作用：提高流的读取、写入的速度
 *   提高读写速度的原因：内部提供了一个缓冲区
 *
 * 3.处理流，就是“套接”在已有的流的基础上。
 *
 * @author JiaMing_Xu
 * @create 2025-01-04-17:39
 */
public class BufferedTest {

    /*
    实现非文本文件的复制
     */
    @Test
    public void BufferedStreamTest(){

        //说明：关闭外层流的同时，内层流也会自动的进行关闭。

    }
}

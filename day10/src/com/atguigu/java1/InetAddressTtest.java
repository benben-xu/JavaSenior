package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程有两个主要的问题：
 * 1.如何准确地定位网络上一台或多泰主机；定位主机上地特定的应用
 * 2.找到主机后如何可靠高效地进行数据传输
 *
 * 二、网络编程中的两个要素：
 * 1.对应问题一：IP和端口号
 * 2.对应问题二：提供网络通信协议：TCP/IP参考模型
 * 
 * @author JiaMing_Xu
 * @create 2025-03-13-21:06
 */
public class InetAddressTtest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.100.1");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("blog.benben.work");
            System.out.println(inet2);
            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}

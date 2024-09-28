package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全的问腿的方式三：Lock锁 --- JDK5.0新增
 *
 * 1. 面试题：synchronized 与 Lock的异同？
 *   相同：二者都可以解决线程安全问题
 *   不同：synchronized机制在执行完相应的同步代码以后，自动释放同步监视器
 *        Lock需要手动的启动同步（Lock()），同时结束同步也需要手动的实现（unLock()）
 *
 * 2. 优先使用顺序：
 * Lock -> 同步代码块（已经进入了方法体，分配了相应资源） -> 同步方法（在方法体之外）
 * @author JiaMing_Xu
 * @create 2024-09-06-12:55
 */
class Windows implements Runnable{
    private int ticket = 100;
    //实例化ReentranLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {

                //2.调用Lock()
                lock.lock();

                if (ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + ":售票，票号为" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                //3.调用解决方法: unlock()
                lock.unlock();
            }

        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Windows w = new Windows();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

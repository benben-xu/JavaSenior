package com.atguigu.java2;

/**
 * @author JiaMing_Xu
 * @create 2024-10-25-23:27
 */

// 先创建好一个接口
interface Fly {
    public void fly();
}

// 创建接口的实现类
class Plane implements Fly {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("飞机用机翼飞行");
    }

}

class Bird implements Fly {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("小鸟用翅膀飞行");
    }
}

// 进行调试
public class interfaceTest {
    public static void main(String[] args) {
        Fly Cfly;
        Bird bird = new Bird();
        Plane plane = new Plane();

        Cfly = bird;// 接口引用实现类对象实例
        Cfly.fly();// 调用实现方法

        Cfly = plane;// 接口引用实现类对象实例
        Cfly.fly();// 调用实现方法

        Fly f1 = new Bird();
        Fly f2 = new Plane();
        f1.fly();
        Bird b1 = (Bird) f1;
        b1.fly();
        Plane p1 = (Plane) f2;
        p1.fly();

    }
}
/*结果：

小鸟用翅膀飞行
飞机用机翼飞行

*/


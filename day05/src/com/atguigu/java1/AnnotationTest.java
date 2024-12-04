package com.atguigu.java1;

import java.util.ArrayList;

/**
 * 注解的使用
 *
 * 1. 理解Annotation:
 * ① jdk5.0 新增的功能
 *
 * ② Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。通过使用Annotation，
 *   程序员可以在不改变原有逻辑的情况下，在源文件嵌入一些补充信息
 *
 * ③ 在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在JavaEE/Android
 *   中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替JavaEE旧版所遗留的繁冗代码和XML配置等。
 *
 * 2. Annotation的使用示例
 * 示例一：生成文档相关的注解
 * 示例二：在编译时进行格式检查（JDK内置的三个基本注解
 * @Override:限定重写父类方法，该注解只能用于方法。
 * @Deprecated:用于表示所修饰的元素(类，方法)已过时。
 * @SuppressWarnings:抑制编译器警告
 *
 * 示例三：跟踪代码依赖性，实现替代配置文件功能
 *
 * 3. 如何自定义注解：参照@SuppressWarning定义
 *      ① 注解声明为@interface
 *      ② 内部定义成员，通常使用value表示
 *      ③ 可以指定成员的默认值，使用default定义
 *      ④ 如果自定义注解没有成员，表明是一个标识作用。
 *    如果注解有成员，在使用注解时，需要指定成员的值。
 *    自定义注解必须配上注解的信息处理流程（使用反射）才有意义。
 *
 * 4. jdk提供的4种元注解
 *    元注解：对现有的注解进行解释说明的注解
 *    Retention:指定所修饰的Annotation的声明周期：SOURCE\CLASS（默认行为）\ RUNTIME
 *              只有声明为RUNTIME声明周期的注解，才能=通过反射获取。
 *    Target:用于 指定被修饰的Annotation能用于修饰哪些程序元素。
 *    ******出现的频率较低******
 *    Documented:表示所修饰的注解在被javadoc解析时，保留下来。
 *    Inherited:被它修饰的Annotation将具有继承性。
 *
 * 5. 通过反射获取注解信息
 *
 * 6. jdk 8 中注解的新特性：可重复注解、类型注解
 *
 * 6.1 可重复注解：
 *
 * 6.2 类型注解：
 *     ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中（如：泛型声明）。
 *     ElementType.TYEP_USE 表示该注解能写在使用类型的任何语句中。
 *
 * @author JiaMing_Xu
 * @create 2024-12-03-21:18
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
    }
}

//@MyAnnotation(value = "hi")
//@MyAnnotations({@MyAnnotation(value = "hi"),@MyAnnotation(value = "abc")})
class Person{
    private String name;
    private int age;

    public Person() {
    }

    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}
interface Info{
    void show();
}

class Student extends Person implements Info{

    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}

class Generic<@MyAnnotation T>{
    public void show() throws  @MyAnnotation RuntimeException{
        ArrayList<@MyAnnotation String> list = new ArrayList<>();
        int num = (@MyAnnotation int)10L;
    }
}
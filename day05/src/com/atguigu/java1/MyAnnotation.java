package com.atguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author JiaMing_Xu
 * @create 2024-12-03-21:50
 */
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER, CONSTRUCTOR,LOCAL_VARIABLE,TYPE_USE})
public @interface MyAnnotation {
    
    String value() default "hello";
}

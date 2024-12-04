package com.atguigu.java1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author JiaMing_Xu
 * @create 2024-12-04-19:46
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER, CONSTRUCTOR,LOCAL_VARIABLE,TYPE_USE})
public @interface MyAnnotations {
    MyAnnotation[] value();

}

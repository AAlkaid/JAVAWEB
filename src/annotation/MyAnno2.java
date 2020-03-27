package annotation;

import java.lang.annotation.*;

/**
 * 四种元注解
 */

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//该Anno3这个注解只能作用于类上
//TYPE : 作用于类
//METHOD： 方法
//FIELD ： 作用于成员变量上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno2
{

}

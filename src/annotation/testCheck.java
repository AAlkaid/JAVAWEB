package annotation;

import junit.Calculator1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 主方法执行，检测被检测的所有方法（加了check注解的方法）
 */
public class testCheck {
    public static void main(String[] args) throws IOException {
//        创建计算器对象
        Calculator1 c = new Calculator1();
//        获取字节码文件对象
        Class cls = c.getClass();
//        获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;//   异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            //        方法上是否有注解
            if (method.isAnnotationPresent(Check.class))
            {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number ++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称 ："+ e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因 ： " + e.getCause().getMessage());
                    bw.write("---------------");
                }
            }
        }
//        方法上是否有注解

        bw.write("一共出现" + number +"次异常");
        bw.flush();
        bw.close();

    }

}

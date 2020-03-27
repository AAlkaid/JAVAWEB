package annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 * //This class can new arbitary objects and execute any methods.
 * 1、配置文件
 * 2、反射
 *
 * STEPS：
 * 1、将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2、在程序中加载读取配置文件
 * 3、使用反射来加载类文件进内存
 * 4、创建对象
 * 5、执行方法
 *
 */
@Pro(className = "annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //This class can new arbitary objects and execute any methods.

        //解析注解
        //1、获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2、获取注解对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3、调用注解对象中定义的抽象方法获取返回值
        String className = an.className();
        String methodName = an.methodName();


        //3、加载该类进内存
        Class cls = Class.forName(className);

        //4、创建对象
        Object obj = cls.newInstance();

        //5、获取方法对象
        Method method = cls.getMethod(methodName);

        //  6、执行方法
        method.invoke(obj);


    }
}

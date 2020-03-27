package reflect;

import domain.Person;
import domain.Student;

import java.io.IOException;
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
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //This class can new arbitary objects and execute any methods.

        // YOU CAN NOT CHANGE ANYTHING IN THIS CLASS/!!!
//        Person p = new Person();
//        p.eat();

//        Student stu = new Student();
//        stu.sleep();
        //1、加载配置文件
        //  1.1创建Properties对象
        Properties pro = new Properties();
        //  1.2加载配置文件，转换为一个集合
        //  1.3路径
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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

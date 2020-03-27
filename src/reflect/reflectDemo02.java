package reflect;

import domain.Person;

import java.io.File;
import java.lang.reflect.Field;

public class reflectDemo02
{
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personclass = Person.class;

        //成员变量
        Field[] fields  = personclass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------------------------");

        Field a = personclass.getField("a");
        Person p = new Person();

        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"buzhenyu");
        System.out.println(p);
        System.out.println("--------------------------");
        Field[] delclaredFields = personclass.getDeclaredFields();
        for (Field delclaredField : delclaredFields) {
            System.out.println(delclaredField);
        }


        System.out.println("--------------------------");


        Field d = personclass.getDeclaredField("d");
        d.setAccessible(true);// 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);

    }
}

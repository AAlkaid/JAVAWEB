package reflect;

import domain.Person;
import domain.Student;

public class reflectDemo01
{
    public static void main(String[] args) throws ClassNotFoundException {
        //1、 Class.forName("全类名")
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        //2、类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3、对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== compare 3 objects
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true


        Class c = Student.class;
        System.out.println(c == cls1);
    }
}

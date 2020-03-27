package reflect;

import domain.Person;

import java.lang.reflect.Method;

public class reflectDemo04
{
    public static void main(String[] args) throws Exception
    {
        Class<Person> personClass = Person.class;

        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();

        //execute method
        eat_method.invoke(p);


        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(p,"饭");

        System.out.println("=======================================");

        //get all public methods
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);//暴力反射
            System.out.println(method);
            System.out.println("==============");
            String name = method.getName();
            System.out.println(name);
        }

        String name = personClass.getName();
        System.out.println(name);

    }
}

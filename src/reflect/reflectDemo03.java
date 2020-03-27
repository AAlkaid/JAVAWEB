package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class reflectDemo03
{
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
//        Constructor<Person> constructor2 = personClass.getConstructor(String.class,int.class);


        System.out.println(constructor);
//        System.out.println(constructor2);

        Object person = constructor.newInstance("buzhenyu", 20);
        System.out.println(person);

        Person person1 = personClass.newInstance();
        System.out.println(person1);

    }
}

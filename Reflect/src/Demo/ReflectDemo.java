package Demo;

import Demo.reflect.Person;

public class ReflectDemo {

    public static void main(String[] args){
        /**
         * 1.getClass()
         */
        Person p = new Person();
        Class personClass = p.getClass();
        System.out.println(personClass.toString());

    }


}

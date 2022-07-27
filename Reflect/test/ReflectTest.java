import Demo.reflect.Person;
import org.junit.Test;

import java.lang.reflect.*;

public class ReflectTest {

    /**
     * 1.getClass()方法
     */
    @Test
    public void ReflectGetClass(){
        Person person = new Person();
        Class personClass = person.getClass();
        System.out.println(personClass);
        System.out.println(person);
    }
    /**
     * 2.类名称.class
     */
    @Test
    public void ReflectClassName(){
        Class personClass = Person.class;
        System.out.println(personClass);
    }

    /**
     * 3.forName
     * 使用私有的方法或属性
     * 需要setAccessible（true）
     */
    @Test
    public void ReflectForName() throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Class.forName("Demo.reflect.Person");
        //System.out.println(personClass);

        Constructor[] constructors1;
        Constructor[] constructors2;
        //获取所有公有的构造方法
        constructors1 = personClass.getConstructors();
        //获取所有的构造方法
        constructors2 = personClass.getDeclaredConstructors();

        /**
        for (Constructor a:constructors1){
            //获得构造函数的类型
            System.out.println("函数类型"+Modifier.toString(a.getModifiers()));
            //获得构造函数的参数
            Class[] parameterTypes =a.getParameterTypes();
            System.out.println("函数参数");
            for (Class a2 : parameterTypes){
                System.out.println(a2.getName());
            }
        }
        for (Constructor b:constructors2)
            System.out.println(Modifier.toString(b.getModifiers()));
*/
        /**
         * 分别是
         * 获取所有的公有属性
         * 获得指定的公有属性
         * 获得所有得属性
         * 获得指定得属性

        Field[] f1= personClass.getFields();
        Field f2 = personClass.getField("atto");
        Field[] f3 = personClass.getDeclaredFields();
        Field f4 = personClass.getDeclaredField("name");
        //通过无参的构造函数创建一个对象
        Object obj = personClass.getConstructor().newInstance();
        //暴力反射，name为私有属性
        f4.setAccessible(true);
        f4.set(obj,"nimasile");
        System.out.println(f4.get(obj).toString());
 */
/**
 * Method[] m1 = personClass.getMethods();
 *         Method[] m2 = personClass.getDeclaredMethods();
 *         Method m3 = personClass.getMethod("setName", String.class);
 *         Method m4 = personClass.getDeclaredMethod("getName");
 *
 *         Object obj = personClass.getConstructor().newInstance();
 *         m3.invoke(obj,"啊这");
 */

        Constructor c5 = personClass.getConstructor(String.class,Integer.class);//获取带有两个参数，分别为string和integer类型的构造函数
        Object obj = c5.newInstance("nima",12);//使用constructor的newInstance方法，初始化对象
  //      System.out.println(obj.toString());


        Field f = personClass.getDeclaredField("name");  //这里如果是取到私有属性要记得使用Declared方法
        Object obj2 = personClass.getConstructor().newInstance();//新建对象
        f.setAccessible(true);//因为取到的属性是私有的，所以需要使用暴力反射
        f.set(obj2,"Aazhe");//把对象的name属性赋值为“Aazhe”
      //  System.out.println(obj2.toString());//输出看到结果为：Person{name='Aazhe', age=null}

        Method m = personClass.getDeclaredMethod("setAge", Integer.class);
        Method m2 = personClass.getDeclaredMethod("setSon", String.class, Integer.class);//传入方法名和参数的类得到方法
        Object obj4 = personClass.getConstructor().newInstance();//新建对象
        Object obj3 = personClass.getConstructor().newInstance();
        m.invoke(obj3,18);//把参数传入方法中，并绑定obj3
        m2.invoke(obj4,"xiaohai",5);//同上，绑定obj4
        System.out.println(obj4.toString());
        System.out.println(obj3.toString());

    }



}

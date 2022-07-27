import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class people {
    private String sex;
    private Integer age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public people(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "people{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void said(){
        System.out.println("sex is"+sex+ "age is"+age);
    }
}

public class JavaEE02{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class peoClass = Class.forName("people");
        Constructor cons = peoClass.getConstructor(String.class, Integer.class);
        Object obj = cons.newInstance("男",17);
        System.out.println(obj.toString());

        Field f = peoClass.getDeclaredField("age");
        f.setAccessible(true);
        f.set(obj, 20);
        Method m = peoClass.getMethod("said",null);
        m.invoke(obj,null);
    }
}

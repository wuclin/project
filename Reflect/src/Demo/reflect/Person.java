package Demo.reflect;

public class Person {
    private String name;
    private Integer age;
    public String atto;

    private String getAtto(){
        return atto;
    }
    private void setAtto(){
        this.atto = "私有属性";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("设置名字为"+name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    private Person(String name){
        this.name = "私有构造";

    }

    public void setSon(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}

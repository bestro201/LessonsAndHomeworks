package staticExample;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("Hello! My name is " + name);
    }
}

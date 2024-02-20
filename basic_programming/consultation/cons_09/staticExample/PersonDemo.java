package staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Bill");

        person1.say();
        person2.say();
    }
}

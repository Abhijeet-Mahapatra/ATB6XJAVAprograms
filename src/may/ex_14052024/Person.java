package may.ex_14052024;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person person) {       // Copy Constructor
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        System.out.println(person1.name + " is " + person1.age + " years old");
        Person person2 = new Person(person1);
        System.out.println(person2.name + " is " + person2.age + " years old");
    }
}

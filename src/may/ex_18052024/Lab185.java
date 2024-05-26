package may.ex_18052024;

public class Lab185 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Lab");
        d2.display();
        Dog d3 = new Dog("Golden Retriever","Dog TT");
        d3.display();
        Dog d4 = new Dog("Dog1","German",10);
        d4.display();

    }
}
class Animal{
    String type;
    Animal() {
        System.out.println("Animal DC");
    }

    Animal(String type) {
        this.type = type;
        System.out.println("Animal PC");
    }
}
class Dog extends Animal{
    String breed;
    int a;

    Dog() {
        System.out.println("Dog DC");
    }

    Dog(String bread) {
        this.breed = bread;
    }

    Dog(String breed, String type) {
        this("Breed set by Dog Only");
        // this.breed = breed;
        this.type = type;
        System.out.println("PC with Two Argument");
    }

    public Dog(String breed, String type, int a) {
        this("Breed set by Dog Only" ,"Golder R");
        this.a = a;
        System.out.println("PC with Two Arg.");
    }

    public Dog(String breed, int a) {
        this.breed = breed;
        this.a = a;
    }

    void display(){
        System.out.println("Type: " + type + ", Breed: " + breed);
    }
}

package may.ex_16052024.singleinheritance;

public class Lab174 {
    public static void main(String[] args) {
        // What is Inheritance??
        // Inherit Attributes and Behaviour from parent, Grand parent

        // SuperClass/ParentClass/BaseClass
        // SubClass/ChildClass/DerivedClass

        // Parent -> Child

        // Child extends Parent{}
        // extend keyword -> parents Attributes are available to the child(class)

        // Single Inheritance
        // Parent -> Programming class
        // Child -> Java class

        //// Java extends Programming
        Programming p = new Programming(12,"KO posan");
        Java j = new Java("lambda exp");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12,"Van Russom");
        p1.printInfo();

        Python python = new Python();
        python.printInfo();
    }
}

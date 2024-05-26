package may.ex_16052024.singleinheritance;

public class Java extends Programming{
    // Single Inheritance  - is A relationship
    // Java is a Programming language
    // Python is a Programming language

    String newFeature;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo(){
        System.out.println("Feature is -> " + this.newFeature);
        bhk3();
    }
}

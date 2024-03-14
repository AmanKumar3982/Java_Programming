class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Parent extends Person {
    String occupation;

    public Parent(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Occupation: " + occupation);
    }
}

class Child extends Person {
    String education;

    public Child(String name, int age, String education) {
        super(name, age);
        this.education = education;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Education: " + education);
    }
}

public class q2 {
    public static void main(String[] args) {
        Parent father = new Parent("Jonney", 45, "Businessman");
        Parent mother = new Parent("Mia", 36, "Actress");
        Child child1 = new Child("Nike", 14, "Class - 9");

        System.out.println("\nFather's Details:");
        father.displayInfo();

        System.out.println("\nMother's Details:");
        mother.displayInfo();

        System.out.println("\nChild's Details:");
        child1.displayInfo();
    }
}

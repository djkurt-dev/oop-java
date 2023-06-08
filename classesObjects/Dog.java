package classesObjects;

public class Dog {
    public String name;
    public int age;
    public String breed;

    void bark() {
        System.out.println("Woof! Woof!");
    }

    void fetch(String item) {
        System.out.println(name + " fetched the " + item);
    }

    void sleep() {
        System.out.println("Sleeping Zzzzzzz....");
    }
}

class App {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Cutie";
        d1.age = 1;
        d1.breed = "Jack Russell";

        System.out.println("Name = " + d1.name);
        System.out.println("Age = " + d1.age);
        System.out.println("Breed = " + d1.breed);

        d1.bark();
        d1.sleep();
        d1.fetch("stick");

        System.out.println();

        Dog d2 = new Dog();
        d2.name = "Scottie";
        d2.age = 5;
        d2.breed = "Border Collie";

        d2.bark();
        d2.sleep();
        d2.fetch("ball");
    }
}
public class Dog {
    // fields
    String name;
    int age;
    String breed;

    // methods bark, fetch, sleep
    void bark() {
        System.out.println("Woof! woof!");
    }

    void fetch(String item) {
        System.out.println(name + " fetched the " + item);
    }

    void sleep() {
        System.out.println("Sleeping ZzzzZzzz");
    }

}

class Herdingdog extends Dog {
    void herd() {
        System.out.println("HErdinggg....");
    }
}

class DogApp {
    public static void main(String[] args) {
        Herdingdog h = new Herdingdog();

        h.name = "Scottie";
        h.age = 7;
        h.breed = "Border Collie";

        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.breed);
        h.herd();
    }
}

package abstraction;

abstract class Dog {
    public void bark() {
        System.out.println("Bark!");
    }

    abstract void poop();
}

class Chihuahua extends Dog {
    void poop() {
        System.out.println("Pooped!!!");
    }
}

class App {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();
    }
}
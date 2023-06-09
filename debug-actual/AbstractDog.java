abstract class AbstractDog {
    String name;

    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chihuahua extends AbstractDog {
    public void poop() {
        System.out.println("Pooped!");
    }
}

class abstractApp {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        c.bark();
        c.name = "Chichi";
        c.poop();
    }
}

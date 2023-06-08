package polymorphism;

class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}

class Parrot extends Bird {
    // overriding
    public void sing() {
        System.out.println("tinininiw tininiww");
    }

    // overloading
    public void sing(String song) {
        System.out.println("Parrot sings " + song);
    }

    // overloading
    public void sing(String song, int times) {
        System.out.println("For " + times + " times this parrot sings " + song);
    }
}

class LoveBird extends Bird {
    public void sing() {
        System.out.println("ch ch ch ch");
    }
}

class App {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();

        Parrot p = new Parrot();
        p.sing();
        p.sing("Uhaw by Dilaw", 5);

        LoveBird l = new LoveBird();
        l.sing();
    }
}

public class Bird {
    void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Parrot extends Bird {
    // overriding
    void sing() {
        System.out.println("tininiw tininiw");
    }

    // overloading
    void sing(String song) {
        System.out.println("Parrot sings " + song);
    }
}

class LoveBird extends Bird {
    // overriding
    void sing() {
        System.out.println("ch ch ch ch");
    }
}

class BirdApp {
    public static void main(String[] args) {
        Bird b = new Bird();
        Parrot p = new Parrot();
        LoveBird l = new LoveBird();
        b.sing();
        p.sing();
        p.sing("Uhaw by Dilaw");
        l.sing();
    }
}

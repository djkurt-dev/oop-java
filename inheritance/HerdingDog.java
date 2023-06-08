package inheritance;

import classesObjects.Dog;

public class HerdingDog extends Dog {
    public void herd() {
        System.out.println("Herddd....");
    }
}

class App {
    public static void main(String[] args) {
        HerdingDog h1 = new HerdingDog();
        h1.name = "Herdy";
        h1.age = 8;
        h1.breed = "German Shepherd";

        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.breed);
        h1.herd();
    }
}
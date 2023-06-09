public class ConsDog {
    String name;
    int age;

    ConsDog(String dname, int dAge) {
        name = dname;
        age = dAge;
    }
}

class app {
    public static void main(String[] args) {
        ConsDog c = new ConsDog("Blackie", 2);

        System.out.println(c.name);
        System.out.println(c.age);
    }
}

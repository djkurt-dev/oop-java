public class Student {
    private String name;
    private int age;

    public void setName(String sname) {
        name = sname;
    }

    public String getName() {
        return name;
    }

    public void setAge(int sAge) {
        age = sAge;
    }

    public int getAge() {
        return age;
    }
}

class studeApp {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jennie");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

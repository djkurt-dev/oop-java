package encapsulation;

public class Student {
    private String name;
    private String program;

    public void setName(String studeName) {
        name = studeName;
    }

    public String getName() {
        return name;
    }

    public void setProgram(String prog) {
        program = prog;
    }

    public String getProgram() {
        return program;
    }
}

class App {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Jennie");
        System.out.println(s.getName());

        s.setProgram("CpE");
        System.out.println((s.getProgram()));

        // s.name = "Jennie";
        // s.program = "BS CpE";

        // System.out.println(s.name);
        // System.out.println(s.program);
    }
}

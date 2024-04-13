abstract class Student {
    public String name;
    public int ID;
    public double grade;
    public int age;
    public String address;

    public Student(String name, int ID, double grade, int age, String address) {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
        this.age = age;
        this.address = address;
    }

    public abstract boolean isPassed(double grade);
}

class Undergrad extends Student {
    public Undergrad(String name, int ID, double grade, int age, String address) {
        super(name, ID, grade, age, address);
    }

    @Override
    public boolean isPassed(double grade) {
        return grade > 70.0;
    }
}

class Grad extends Student {
    public Grad(String name, int ID, double grade, int age, String address) {
        super(name, ID, grade, age, address);
    }

    @Override
    public boolean isPassed(double grade) {
        return grade > 80.0;
    }
}

public class Three_c {
    public static void main(String[] args) {
        // Create Grad objects
        Grad grad1 = new Grad("John Doe", 1001, 85.5, 25, "123 Main St");
        Grad grad2 = new Grad("Jane Smith", 1002, 75.0, 28, "456 Elm St");

        // Create Undergrad objects
        Undergrad undergrad1 = new Undergrad("Alice Johnson", 2001, 65.0, 20, "789 Oak St");
        Undergrad undergrad2 = new Undergrad("Bob Anderson", 2002, 85.0, 22, "987 Pine St");

        // Test isPassed method for each object
        System.out.println(grad1.name + " Passed: " + grad1.isPassed(grad1.grade));
        System.out.println(grad2.name + " Passed: " + grad2.isPassed(grad2.grade));
        System.out.println(undergrad1.name + " Passed: " + undergrad1.isPassed(undergrad1.grade));
        System.out.println(undergrad2.name + " Passed: " + undergrad2.isPassed(undergrad2.grade));
    }
}

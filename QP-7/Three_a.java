class Employee {
    int emp_no;
    String name;
    double salary;

    public void display() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    double reward;

    public Manager(int emp_no, String name, double salary, double reward) {
        this.emp_no = emp_no;
        this.name = name;
        this.salary = salary;
        this.reward = reward;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Reward: $" + reward);
    }
}

class Scientist extends Employee {
    String perks;

    public Scientist(int emp_no, String name, double salary, String perks) {
        this.emp_no = emp_no;
        this.name = name;
        this.salary = salary;
        this.perks = perks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Perks: " + perks);
    }
}

public class Three_a {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "John Doe", 75000, 5000);
        Scientist scientist = new Scientist(201, "Jane Smith", 80000, "Health Insurance");

        System.out.println("--- Manager Details ---");
        manager.display();

        System.out.println("\n--- Scientist Details ---");
        scientist.display();
    }
}

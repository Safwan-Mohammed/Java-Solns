class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void print_Details() {
        double salary = calculateSalary();
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Calculated Salary: $" + salary);
    }

    protected double calculateSalary() {
        return basicSalary + 2000;
    }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, double basicSalary, String specialization) {
        super(name, basicSalary);
        this.specialization = specialization;
    }

    @Override
    public void print_Details() {
        double salary = calculateSalary();
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Calculated Salary: $" + salary);
    }

    @Override
    protected double calculateSalary() {
        return basicSalary + 3000;
    }
}

public class Three_c {
    public static void main(String[] args) {

        //Another method is to takr inputs and do it.

        Employee emp1 = new Employee("John Doe", 50000);
        Doctor doc1 = new Doctor("Jane Smith", 80000, "Cardiologist");

        System.out.println("Employee Details:");
        emp1.print_Details(); 

        System.out.println("\nDoctor Details:");
        doc1.print_Details();
    }
}

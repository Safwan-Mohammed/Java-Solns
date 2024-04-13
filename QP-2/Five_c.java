class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {
    private int empid;
    private String empname;
    private int empage;
    private double empsalary;
    private String empaddress;

    public Employee(int empid, String empname, int empage, double empsalary, String empaddress)
            throws InvalidAgeException, InvalidSalaryException {
        if (empage < 18 || empage > 60) {
            throw new InvalidAgeException("Invalid age! Age should be between 18 and 60.");
        }
        if (empsalary < 5000) {
            throw new InvalidSalaryException("Invalid salary! Minimum salary should be 5000.");
        }

        this.empid = empid;
        this.empname = empname;
        this.empage = empage;
        this.empsalary = empsalary;
        this.empaddress = empaddress;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Age: " + empage);
        System.out.println("Employee Salary: " + empsalary);
        System.out.println("Employee Address: " + empaddress);
    }
}

public class Five_c {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "John Doe", 25, 6000, "123 Main St");
            Employee emp2 = new Employee(102, "Jane Smith", 16, 4500, "456 Elm St");

            System.out.println("Valid Employee Details:");
            emp1.displayDetails();

            System.out.println();

            System.out.println("Invalid Employee Details:");
            emp2.displayDetails();

        } catch (InvalidAgeException | InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

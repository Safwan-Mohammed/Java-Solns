import java.util.Scanner;

class Student {
    private String studentName;
    private String studentUSN;

    public Student(String studentName, String studentUSN) {
        this.studentName = studentName;
        this.studentUSN = studentUSN;
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student USN: " + studentUSN);
    }

    public void searchStudent(String searchUSN) {
        if (studentUSN.equals(searchUSN)) {
            System.out.println("Student Found:");
            display();
        } else {
            System.out.println("Student with USN " + searchUSN + " not found.");
        }
    }
}

public class Two_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student 1 name and USN respectively");
        Student student1 = new Student(sc.nextLine(), sc.nextLine());
        System.out.println("Enter Student 2 name and USN respectively");
        Student student2 = new Student(sc.nextLine(), sc.nextLine());

        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.display();
        System.out.println();

        System.out.println("Enter the USN to be searched for: ");
        String USN = sc.nextLine();

        student1.searchStudent(USN);
        System.out.println();

        student2.searchStudent(USN);
        System.out.println();
    }
}

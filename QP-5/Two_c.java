import java.util.Scanner;

class Student{
    int id;
    String name;
    int[] marks = new int[3];

    Student(int id, String name, int[] marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double average(){
        double avg = 0;
        for(int i = 0 ; i < marks.length; i++){
            avg += marks[i];
        }
        avg /= marks.length;
        return avg;
    }
}

public class Two_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        Student[] stud = new Student[n];

        for(int i = 0 ; i < n; i++){
            int[] marks = new int[3];
            int id;
            String name;
            System.out.println("Enter the ID and Name of student respectiively: ");
            id = sc.nextInt();
            sc.next();
            name = sc.nextLine();
            System.out.println("Enter the three subject marks of students: ");
            for(int j = 0 ; j < 3; j++){
                marks[i] = sc.nextInt();
            }
            stud[i] = new Student(id, name, marks);
        }

        System.out.println("Average Marks\n ");
        for(int i = 0 ; i < n; i++){
            System.out.println("Student "+ (i+1) +" : "+stud[i].average());
        }
    }
}

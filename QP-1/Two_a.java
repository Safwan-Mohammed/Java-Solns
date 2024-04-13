import java.util.Scanner;

class Box{
    private double height, width, length;
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double compute(){
        return this.length * this.width * this.height;
    }
}

public class Two_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length, width, height;
        System.out.println("Enter the length width and height of box respectively\n");
        length = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
        Box b =  new Box(length, width, height);
        System.out.println("Volume : "+b.compute());
    }
}
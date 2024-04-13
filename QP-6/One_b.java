public class One_b {
    public static void main(String[] args) {
        int[] numbers = {125, 132, 95, 116, 110};

        int highest = numbers[0]; 

        for (int number : numbers) {
            if (number > highest) {
                highest = number; 
            }
        }
        System.out.println("Highest number in the array: " + highest);
    }
}

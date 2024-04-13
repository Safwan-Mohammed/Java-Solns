import java.util.Scanner;

public class One_c {
    public static void main(String[] args){
        
        Scanner sc  = new Scanner(System.in);

        int m, n;
        System.out.println("Enter Dimension of Matrix: ");
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] arr = new int[m][n];
        int[][] pos = new int[m][n];
        int[][] neg = new int[m][n];

        System.out.println("Enter the Matrix: ");
        for(int i = 0 ; i < m ; i++)
            for(int j = 0 ; j < n; j++)
                arr[i][j] = sc.nextInt();

        for(int i = 0 ; i < m ; i++)
            for(int j = 0 ; j < n; j++)
                if(arr[i][j] > 0){
                    pos[i][j] = arr[i][j];
                    neg[i][j] = 0;
                }
                else if(arr[i][j] < 0){
                    neg[i][j] = arr[i][j];
                    pos[i][j] = 0;
                }

        System.out.println("Positive Matrix: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++)
                System.out.print(pos[i][j]);
            System.out.println();
        }

        System.out.println("Negative Matrix: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++)
                System.out.print(neg[i][j]);
            System.out.println();
        }
    }    
}

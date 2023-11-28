import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] arr3 = new int[n][m];

        for(int i =0; i<arr1.length;i++){
            for(int j =0; j<arr1[i].length ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<arr3.length;i++){
            for(int j =0; j<arr3[i].length ; j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        for(int i =0; i<arr3.length;i++){
            for(int j =0; j<arr3[i].length ; j++){
                System.out.print(arr3[i][j]+" ");;
            }
            System.out.println();
        }
    }
}


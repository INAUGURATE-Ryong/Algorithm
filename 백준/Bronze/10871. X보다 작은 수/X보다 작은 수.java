import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = sc.nextInt();

        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] < n){
                System.out.print(arr1[i]+" ");
            }

        }

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            int b = sc.nextInt();
            arr1[i] = b;

        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }


}


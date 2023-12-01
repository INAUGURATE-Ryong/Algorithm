import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double sum = 0;
        double temp = 0;
        double[] arr = new double[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] / arr[m - 1] * 100;
            sum += arr[i];
            temp =sum / m;

        }

        System.out.println(temp);


    }

}

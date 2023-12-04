import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] arr1 = new int[4];
        arr1[0] = x;
        arr1[1] = y;
        arr1[2] = w-x;
        arr1[3] = h-y;
        Arrays.sort(arr1);
        System.out.println(arr1[0]);

   }


}

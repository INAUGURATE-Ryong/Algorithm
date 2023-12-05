import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.nextLine().toCharArray(); // 문자열을 문자로 받아 배열에 담기.
        Arrays.sort(arr1);
        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i]);

        }
    }


}


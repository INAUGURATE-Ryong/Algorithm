
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int sum = 0;
        int center = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        Arrays.sort(a);
        center = a[2];
        System.out.println(sum/5);
        System.out.println(center);

    }

}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long[] arr = new long[A + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= A; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());

        }
        for (int i = 0; i < B; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            System.out.println(arr[n] - arr[m - 1]);
        }


    }

}

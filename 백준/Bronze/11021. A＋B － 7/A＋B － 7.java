import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String[] n = br.readLine().split(" ");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[1]);

            System.out.println("Case #" + (i + 1) + ": " + (a + b));


        }


    }
}
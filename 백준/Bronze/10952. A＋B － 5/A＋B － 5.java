import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] n = br.readLine().split(" ");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[1]);
            if(a==0 && b==0) {
                break;
            }else{
                System.out.println(a+b);
            }

        }

    }
}
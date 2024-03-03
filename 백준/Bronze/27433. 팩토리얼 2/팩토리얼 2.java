import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        Long M = 1L;
        if(N==0){
            System.out.println(1);
        } else {
            for (int i = 1 ; i <=N ; i++) {
                M *=i;
            }
            System.out.println(M);
        }

    }
}

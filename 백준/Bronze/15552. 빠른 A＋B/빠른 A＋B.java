import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i =0; i < a ; i++) {
            String[] parts = br.readLine().split(" ");
            int m = Integer.parseInt(parts[0]);
            int n = Integer.parseInt(parts[1]);
            bw.write(Integer.toString(m+n));
            bw.newLine();

        }
        bw.flush();  // 버퍼 비우기
        bw.close();
    }
}

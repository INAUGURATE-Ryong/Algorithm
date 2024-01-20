import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int B = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < A; i++) {
            if(Integer.parseInt(st.nextToken())==B){
                sum++;
            }
        }

        System.out.println(sum);

    }
}

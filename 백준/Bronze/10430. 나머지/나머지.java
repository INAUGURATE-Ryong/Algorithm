import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B%C)%C );
        System.out.println( (A*B)%C );
        System.out.println( (A%C * B%C)%C );

    }




}


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n*(n-1));



    }



}
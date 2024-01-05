import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum+=ch[i]-'0';
        }

        System.out.println(sum);


    }

}



import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        System.out.println(M*(N%10));
        System.out.println(M*((N%100)/10));
        System.out.println(M * (N/100));
        System.out.println(M*N);
    }

}
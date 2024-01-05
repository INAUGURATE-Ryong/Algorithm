import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[] = new int[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;

        for (int i = 0 ; i<N;i++){
            if(M[i] > max) max = M[i];
            sum += M[i];

        }
        System.out.println(sum*100.0/max/N);
    }




}


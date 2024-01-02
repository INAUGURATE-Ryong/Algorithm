import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            if(set.contains(br.readLine())){
                count++;
            }
        }

        System.out.println(count);


    }



}
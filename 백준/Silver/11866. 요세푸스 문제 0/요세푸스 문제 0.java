import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= M; i++) {
            queue.offer(i);
        }
        sb.append("<");
        while (queue.size() > 1){
            for (int i = 1; i < N; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append((queue.poll())).append(">");
        System.out.println(sb);

    }



}


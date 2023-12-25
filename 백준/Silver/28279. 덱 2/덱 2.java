import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "1":
                    queue.addFirst(Integer.parseInt(str[1]));
                    break;
                case "2":
                    queue.addLast(Integer.parseInt(str[1]));
                    break;
                case "3":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int a = queue.pollFirst();
                        sb.append(a).append("\n");
                    }
                    break;
                case "4":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int a = queue.pollLast();
                        sb.append(a).append("\n");
                    }
                    break;
                case "5":
                    sb.append(queue.size()).append("\n");
                    break;
                case "6":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else sb.append(0).append("\n");
                    break;

                case "7":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int b = queue.getFirst();
                        sb.append(b).append("\n");
                        
                    }
                    break;
                case "8":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                        
                    } else {
                        int b = queue.getLast();
                        sb.append(b).append("\n");
                        
                    }
                    break;

            }
        }
        System.out.println(sb.toString());

    }


}


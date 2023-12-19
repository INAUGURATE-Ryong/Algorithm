import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String line = br.readLine();
        int a = Integer.parseInt(line);
        int sum =0;
        for (int i = 0; i < a; i++) {
            String b = br.readLine();
            if(!b.equals("0")){
                stack.push(b);
            }else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            int currentNumber = Integer.parseInt(stack.pop());
            sum += currentNumber;
        }
        System.out.println(sum);

    }


}

import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awy\\Desktop/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 1;

        Stack<Integer> stack = new Stack<>();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num==m){
                m++;
            } else {
                if(stack.isEmpty()){
                    stack.push(num);
                }else if(stack.peek() >num){
                    stack.push(num);
                }else {
                    while (!stack.isEmpty() && m == stack.peek()){
                        m++;
                        stack.pop();
                    }
                    stack.push(num);

                }
            }

        }
        while (!stack.isEmpty() && stack.peek()==m){
            m++;
            stack.pop();
        }

        if(stack.isEmpty()){
            System.out.println("Nice");
        }else {
            System.out.println("Sad");
        }
    }


}
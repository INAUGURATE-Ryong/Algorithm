
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());  // StringBuffer 도 가능.
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
   }


}

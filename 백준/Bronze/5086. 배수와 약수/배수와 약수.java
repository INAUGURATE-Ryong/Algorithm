
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==0 && y==0) break;
            if (x > y) {
                if (x % y == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else  {
                if (y % x == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }

        }
    }


}

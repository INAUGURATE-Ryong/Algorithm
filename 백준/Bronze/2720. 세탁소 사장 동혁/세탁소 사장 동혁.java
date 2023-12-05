import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            System.out.print(b / 25 + " ");
            System.out.print(b % 25 / 10 + " ");
            System.out.print(b % 25 % 10 / 5 + " ");
            System.out.print(b % 25 % 10 % 5);
            System.out.println();
        }
    }

}

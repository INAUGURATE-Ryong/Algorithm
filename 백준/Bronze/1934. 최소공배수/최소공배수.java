
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i <a ; i++) {
            int result = lcm(sc.nextInt(),sc.nextInt());
            System.out.println(result);
        }
    }

    private static int lcm(int x, int y) {
        return (x*y) / gcm(x,y);
    }

    public static int gcm(int x, int y) {
        if(x % y ==0){
            return y;
        }
        return gcm(y,x%y);
    }

}
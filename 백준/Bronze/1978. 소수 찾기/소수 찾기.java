import java.util.Scanner;
//import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
      //  System.setIn(new FileInputStream("C:\\Users\\awy\\Desktop/input.txt"));
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        int cnt2 = 0;
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int cnt = 0;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0 && n != 1) {
                cnt2++;
            }

        }
        System.out.println(cnt2);

    }

}
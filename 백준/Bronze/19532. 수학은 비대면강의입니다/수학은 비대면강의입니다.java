import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for (int x = -999; x <1000 ; x++) {
            for (int y = -999; y < 1000; y++) {
                if(a*x + b*y == c){
                    if(d*x+e*y==f){
                        System.out.println(x+" "+y);
                        break;
                    }
                }


            }

        }


    }

}

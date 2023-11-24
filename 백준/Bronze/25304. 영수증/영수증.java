import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i=1;i<=c;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();      
            t = t-(m*n);
        }
        if (t ==0){
            System.out.println("Yes");
        }else {System.out.println("No");}        
    }
    
 }
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] val = new int[31];
        for(int i=0;i<28;i++){
           int num = sc.nextInt();
            val[num] = 1;
        }
        for (int i=1;i<31;i++){
            if (val[i] !=1){
                System.out.println(i);
            }
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alphabetCount = new int[26];
        for(int i=0;i < alphabetCount.length;i++){
            alphabetCount[i] = -1;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (alphabetCount[ch-'a'] == -1){
                alphabetCount[ch-'a'] = i;
            }

        }
        for(int i = 0;i<alphabetCount.length;i++){
            System.out.print(alphabetCount[i]+" ");
              
        }

    }
}

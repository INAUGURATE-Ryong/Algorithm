import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.setIn(new FileInputStream("C:\\Users\\awy\\Desktop/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch-'a']+=1;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max = arr[i];
                ch = (char) (i+65);
            }
            else if(arr[i]==max){
                ch = '?';
            }

        }
        System.out.println(ch);


    }

}
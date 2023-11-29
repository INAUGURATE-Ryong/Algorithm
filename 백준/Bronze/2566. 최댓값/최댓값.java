import java.util.Arrays;
import java.util.Scanner;
//import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[9][9];
        int temp = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > temp) {
                    temp = arr1[i][j];
                }

            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j] == temp){
                    System.out.println(temp);
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }


    }
}


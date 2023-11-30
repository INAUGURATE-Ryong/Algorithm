import java.util.Scanner;
//import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
      //  System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = {1,1,2,2,2,8};
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr2[i] -arr1[i];
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }
}

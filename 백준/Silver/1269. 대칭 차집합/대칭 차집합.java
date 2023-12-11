import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < M; i++) {
            set1.add(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            set2.add(sc.nextInt());
        }
        Set<Integer> set3 = new HashSet<Integer>(set1);
        
        set1.removeAll(set2);  // a-b
        set2.removeAll(set3);  // b-a
        set1.addAll(set2);  // a합b
        System.out.println(set1.size());


    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());  //countTokens 는 배열의 length처럼 토큰의 개수를 반환

    }
}

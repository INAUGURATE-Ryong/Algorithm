import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){  // hasNextLine 입력 소스에서 다음에 읽을 문자열이 있는지 여부를 확인하여 없으면 false,있으면 true를 반환
              System.out.println(sc.nextLine());
        }
      
    }
}

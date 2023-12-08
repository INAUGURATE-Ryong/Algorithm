import java.util.*;

public class Main {
    public static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        HashMap<Integer,String> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for (int i = 1; i < a+1; i++) {
            String str = sc.next();
            hm1.put(i,str);
            hm2.put(str,i);
        }
        for (int i = 0; i < b; i++) {
            String str2 = sc.next();
            if(isNumeric(str2)){
                System.out.println(hm1.get(Integer.parseInt(str2)));
            }else
                System.out.println(hm2.get(str2));
        }

    }

}

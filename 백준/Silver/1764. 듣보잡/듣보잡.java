import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] tokens = line.split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        HashSet<String> set = new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < b; i++) {
            String name = br.readLine();
            if(set.contains(name)){
                arr.add(name);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }


}


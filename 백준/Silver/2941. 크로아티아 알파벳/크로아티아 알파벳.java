import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String string[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i = 0; i < string.length; i++) {
            if(str.contains(string[i])){
                str = str.replace(string[i],"?");
            }

        }
        System.out.println(str.length());
    }
}
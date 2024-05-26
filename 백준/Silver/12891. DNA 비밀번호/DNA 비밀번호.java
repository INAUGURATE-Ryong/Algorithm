import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char A[] = new char[S];
        checkSecret = 0; // 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수
        // (ex 변수가 4가 되면 모든조건 만족이니 count ++)

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++; // 4개의 문자를 만족해야 하는데 0이면 무조건 만족하는거니 ++
            }
        }
        for (int i = 0; i < P; i++) { //부분문자열 처음 받을때 세팅
            Add(A[i]);

        }
        if(checkSecret == 4) {
            Result++;
        }
        //슬라이딩윈도우 이건 처음 셋팅 다음 단계부터
        for (int i = P; i < S; i++) { // 범위를 유지하면서 한칸씩 이동하는 for문
            int j = i-P; //i는 부분배열의 끝부분 j는 첫부분
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) {
                Result++;
            }
        }
        System.out.println(Result);
        br.close();

    }

    private static void Remove(char c) {  // 제거되는 문자를 처리하는 함수
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }

    }

    private static void Add(char c) { //새로 들어온 문자를 처리하는 함수
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}



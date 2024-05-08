import java.util.Stack;

public class Solution {
    static public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            // 문자열 s를 현재 인덱스 i를 시작점으로 하는 문자열과 그 이전 부분으로 분할. 문자열을 회전시켜 새로운 문자열 str을 생성
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j); // 현재 문자 가져오기
                if (stack.isEmpty()) {
                    stack.push(c); //스택이 비어있으면 현재 문자를 스택에 추가
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                    //현재 문자가 닫는 괄호이고, 스택의 맨 위에 있는 괄호가 해당하는 여는 괄호와 짝이 맞으면 스택에서 해당 여는 괄호를 제거
                } else {
                    stack.push(c); //위의 조건이 모두 아니라면 현재 문자를 스택에 추가
                }                

            }
            if (stack.isEmpty()) {
                answer++;
                //스택이 비어있으면 이는 올바른 괄호 쌍을 형성하는 경우이기에 answer를 증가
            }
        }

        return answer;
    }
}
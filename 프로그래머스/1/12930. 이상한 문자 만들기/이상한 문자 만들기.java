class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        for (String string: array) {
            cnt = string.contains(" ") ? 0 : cnt+1;
            answer += cnt%2 == 0 ? string.toLowerCase() : string.toUpperCase();

        }

        return answer;

    }
}
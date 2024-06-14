class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            if(str.compareTo(p)<=0) { // str의 값이 p보다 작을 경우 
                answer++;
            }
        }
        return answer;
    }
}
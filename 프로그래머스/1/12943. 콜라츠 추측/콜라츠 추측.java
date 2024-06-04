class Solution {
        public static int solution(int num){
        int answer = 0;
        while (num !=1){
            num = num%2 == 0 ? num/2 : num*3+1;
            answer++;
            if(answer > 400){
                return -1;
            }
        }
        return answer;

    }
}
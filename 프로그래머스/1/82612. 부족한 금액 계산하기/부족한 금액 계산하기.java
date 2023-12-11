class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        long answer = 0;
        for(int i = 1; i <= count;i++){
            total += price *i;            
        }
        if(total > money){
            answer = total - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
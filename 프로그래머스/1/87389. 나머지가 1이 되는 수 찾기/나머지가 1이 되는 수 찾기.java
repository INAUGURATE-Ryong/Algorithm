class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n;i >= 1;i--){
            if(n%i ==1){
                answer = i;
            }
        }
        return answer;
    }
}

/*
for(answer = 1; answer <n; answer ++){
if(n%answer ==1) break;
}*/
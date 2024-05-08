class Solution {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for(int i= 0;i< ingredient.length ; i++){
            sb.append(ingredient[i]); //sb에 값 담기
            if(sb.length()>3){ // 길이가 3초과일떄
                if(sb.charAt(sb.length()-1) == '1' && // charAt[인덱스]는 그 인덱스의 값 불러오기 -> 그래서 마지막 값이 1인지 확인
                    sb.charAt(sb.length()-2) == '3' && //마지막의 바로 앞자리가 3인지 확인 
                    sb.charAt(sb.length()-3) == '2' &&
                    sb.charAt(sb.length()-4) == '1') {
                    answer ++;
                    sb = new StringBuilder(sb.substring(0, sb.length()-4)); 
                    // 마지막 4자리 삭제 하기
                }
            }
        }
        return answer;
    }
}

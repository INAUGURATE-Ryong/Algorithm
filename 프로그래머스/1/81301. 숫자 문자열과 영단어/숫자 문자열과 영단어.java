class Solution {
    public int solution(String s) {
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0;i<number.length;i++){
            if(s.contains(number[i])) {// 문자가 있는지 판별
                s=s.replace(number[i],Integer.toString(i)); // 영단어를 숫자로 변환 (i값이 int라서 tostring으로 형변환)
            }
        }
        return Integer.parseInt(s);
    }
}
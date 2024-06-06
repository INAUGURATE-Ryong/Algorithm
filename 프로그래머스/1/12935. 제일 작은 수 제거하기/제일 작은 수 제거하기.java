class Solution {
    public int[] solution(int[] arr) {
//배열 길이가 1인 경우 -1 반환
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        //배열 길이가 1보다 큰 경우
        int[] answer = new int[arr.length-1];

        int min = arr[0];
        //가장 작은 수 구하기
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                continue; // arr[i]가 가장 작은 값인 경우, 이를 건너뛰고 다음 반복으로 넘어감
            }
            answer[index] = arr[i];
            index++;
            // arr[i]가 가장 작은 값이 아닌 경우, answer 배열에 추가하고 index를 1 증가시킴
        }
        return answer;
    }
}
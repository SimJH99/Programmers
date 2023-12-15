class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 45;
        
        for(int i = 0; i< numbers.length; i++){
            for(int j =1; j <= 9; j++){
                if(numbers[i] == j){
                    sum -= numbers[i];
                }
            }
        }
        
        answer = sum;
        
        return answer;
    }
}
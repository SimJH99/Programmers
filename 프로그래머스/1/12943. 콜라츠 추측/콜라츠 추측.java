class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long x = num;
        
        while(x != 1){
            if(x % 2 ==0){
                x = x / 2;
            } else {
                x = (x*3)+1;
            }
            answer++;
            
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        
        
        
        return answer;
    }
}
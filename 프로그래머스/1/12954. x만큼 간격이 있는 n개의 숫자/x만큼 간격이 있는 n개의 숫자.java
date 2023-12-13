class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        int count = 0;
        
        for(int i =1; i <= n; i++){
            answer[count] = (long)x * (long)i;
            count++;    
            
            
        }
        
        return answer;
    }
}
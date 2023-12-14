class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = 1;
        int count = 1;
        
        while(a <= n){
            a *= count;
            count++;
        }
        
        answer = count-2;
        
        return answer;
    }
}
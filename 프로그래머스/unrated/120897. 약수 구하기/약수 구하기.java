class Solution {
    public int[] solution(int n) {
        int a = 0;
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[a] += i;
                a++;
            }
        }
        
        return answer;
    }
}
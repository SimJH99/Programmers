class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n 하고 6의 최소공배수를 구하는거?
        int a = 6;
        int min_num = 0;
        
        int min = (n > a) ? n : a;
        for(int i = 1; i <= min; i++) {
            if(a % i == 0 && n % i == 0) {
                 min_num = i;
            }
        }
        
        answer = ((a / min_num) * (n / min_num) * min_num) / a;
                
        
        return answer;
    }
}
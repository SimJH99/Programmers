class Solution {
    static int answer = 0;
    static int count = 0;
    public int solution(int balls, int share) {
        int start = 0;
        recur(balls, share, start);
        return answer;
    }
    
    static void recur(int balls, int share, int start){
        if(count == share){
            answer++;
            return;
        }
        
        for(int i = start; i < balls; i++){
            count++;
            recur(balls, share, i+1);
            count--;
        }
    }
}
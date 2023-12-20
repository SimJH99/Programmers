class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i =0; i < date1.length; i++)
        {
            if(date1[0] > date2[0]){
                answer = 0;
            }else if(date1[1] > date2[1]){
                answer = 0;
            } else if(date2[i] - date1[i] > 0){
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }        
        
        return answer;
    }
}
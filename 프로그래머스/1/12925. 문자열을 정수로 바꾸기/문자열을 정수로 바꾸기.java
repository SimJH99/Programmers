class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.substring(0,1) == "-"){
            String int1 = s.substring(1,s.length());
            answer = (-1) * Integer.parseInt(int1);
        } else{
            String int2 = s.substring(0,s.length());
            answer = Integer.parseInt(int2);
        }
        
        return answer;
    }
}
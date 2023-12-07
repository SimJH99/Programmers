class Solution {
    public String solution(String s) {
        String answer = new String();
        
        int a = s.length();
        
        if(s.length() % 2 == 1) {
            answer = s.substring((a / 2) ,(a / 2 ) + 1);
        } else {
            answer = s.substring((a / 2) - 1,(a / 2) + 1);
        }
        return answer;
    }
}
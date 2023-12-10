class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String myStr = myString.toUpperCase();
        String pat2 = pat.toUpperCase();
        
        if(myStr.contains(pat2)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}
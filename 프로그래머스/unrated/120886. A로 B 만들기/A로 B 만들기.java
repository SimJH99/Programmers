class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        int beforeInt = 0;
        int afterInt = 0;
        
        for(int i = before.length()-1; i >= 0; i--){
            char beforeChar = before.charAt(i);
            char afterChar = after.charAt(i);
            
            beforeInt += (beforeChar - '0');
            afterInt += (afterChar - '0');
        }
        
        if(beforeInt == afterInt){
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        
        
        
        
        return answer;
    }
}
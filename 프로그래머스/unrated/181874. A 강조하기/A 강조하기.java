class Solution {
    public String solution(String myString) {
        String answer = new String();
        
        String myStr = myString.toLowerCase();
        
        for(int i = 0; i < myStr.length(); i++){
            char my_char = myStr.charAt(i);
            if(my_char == 'a'){
                answer += 'A';
            }
            else {
                answer += my_char;
            }
        }
        
        return answer;
    }
}
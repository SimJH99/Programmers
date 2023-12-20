class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = new String();
        int count = 0;
        
        String subStr = my_string.substring(s, e+1);

        String reverse = new String();

        for(int i = subStr.length()-1 ; i >= 0 ; i--){
            char myChar = subStr.charAt(i);
            reverse += myChar;
        }

        for(int i =0 ; i< my_string.length(); i++){
            char my_char = my_string.charAt(i);
            if(i >= s && i <= e){
               answer += reverse.charAt(count);
               count++;
            } else {
                answer += my_char;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string) {
        String answer = new String();
        
        for(int i = 0; i < my_string.length(); i++) {
            char my_char = my_string.charAt(i);
            if(my_char >= 97 && my_char <= 122){
                answer += (char)(my_char - 32);
            } else if(my_char >= 65 && my_char <= 90) {
                answer += (char)(my_char + 32);
            }
        }
        
        return answer;
    }
}
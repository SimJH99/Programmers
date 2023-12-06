class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = new String();
        char my_char_1 = my_string.charAt(num1);
        char my_char_2 = my_string.charAt(num2);
        
        char temp;
        
        temp = my_char_1;
        my_char_1 = my_char_2;
        my_char_2 = temp;
        
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer += my_char_1;
            } else if (i == num2) {
                answer += my_char_2;
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        
        return answer ;
    }
}
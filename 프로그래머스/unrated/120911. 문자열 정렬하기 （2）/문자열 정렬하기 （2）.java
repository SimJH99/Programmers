import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] ch_arr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch_arr[i] = (char)(ch + 32);
            } else { 
                ch_arr[i] = ch;
            }
        }
        
        Arrays.sort(ch_arr);
        
        String answer = new String(ch_arr);
        
        return answer;
    }
}
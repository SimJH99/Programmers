import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = new String();
        
        for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) 
                answer += my_string.charAt(i);
		}

        
        
        return answer;
    }
}
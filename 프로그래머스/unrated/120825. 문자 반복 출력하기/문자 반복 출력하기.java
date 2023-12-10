class Solution {
    public String solution(String my_string, int n) {
        String answer = new String();
        
        for(int i = 0; i < my_string.length(); i++) {
            char my_char = my_string.charAt(i);
                for(int j = 0; j < n; j++) {
                    answer += my_char;
                }
        }
        
        return answer;
    }
}
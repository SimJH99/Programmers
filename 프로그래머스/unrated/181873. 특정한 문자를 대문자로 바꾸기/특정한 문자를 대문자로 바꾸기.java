class Solution {
    public String solution(String my_string, String alp) {
        String answer = new String();
        
        
        
        char[] my_char = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++) {
             if(my_char[i] == alp.charAt(0)) {
                my_char[i] = (char)(my_char[i] - 32) ;
                answer += my_char[i];
             } else {
                 answer += my_char[i];
             }
        }
        
        return answer;
    }
}
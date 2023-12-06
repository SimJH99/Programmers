class Solution {
    public String solution(String cipher, int code) {
        String answer = new String();
        
        for(int i = 0; i < cipher.length(); i++) {
            char ch_ci = cipher.charAt(i);
                for(int j = 0; j < (cipher.length() / code) + 1; j++) {
                    if((i+1) == code*j) {
                    answer += ch_ci;
                }  
            }

        }
        return answer;
    }
}
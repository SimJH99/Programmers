class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = new String();
        
        
        
        for(int i = 0; i < my_string.length(); i+=m){
            for(int j =0; j < m; j++){
                char my_char = my_string.charAt(i+j);
                if(j == (c-1)){
                    answer += my_char;
                }
            }
        }
        
        return answer;
    }
}
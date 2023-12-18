class Solution {
    public String solution(String n_str) {
        String answer = new String();
        
        int count = 0;
        
        for(int i =0; i < n_str.length(); i++){
            char n_char = n_str.charAt(i);
            if(n_char == '0'){
                count++;
            } else if(n_char != '0'){
                answer = n_str.substring(count);
                break;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String rsp) {
        String answer = new String();
        
        for(int i = 0; i < rsp.length(); i++) {
            char rsp_ch = rsp.charAt(i);
            if(rsp_ch == '2') {
               answer += '0';
            } else if (rsp_ch == '0') {
                answer += '5';
            } else if (rsp_ch == '5') {
                answer += '2';
            }
        }
        
        
        return answer;
    }
}
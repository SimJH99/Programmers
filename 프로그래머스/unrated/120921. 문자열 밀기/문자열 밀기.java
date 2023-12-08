class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(A);
        
        while(true) {
            if(sb.toString().equals(B)){
                break;
            }
            answer++;
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1, sb.length());
            if(answer > A.length()){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
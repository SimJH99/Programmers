class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        
        int[] answer = new int[str.length()];
        
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(str.length()-1-i);
            answer[i] = (int)(ch-'0');
        }
        
        return answer;
    }
}
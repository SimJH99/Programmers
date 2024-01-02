class Solution {
    public int solution(int n) {
        
        String third = new String();
        third = Integer.toString(n,3);

        String reverse = new String();
        for(int i = third.length()-1; i >=0; i--){
            char ch = third.charAt(i);
            reverse += ch;
        }

        int answer = Integer.parseInt(reverse,3);
        
        return answer;
    }
}
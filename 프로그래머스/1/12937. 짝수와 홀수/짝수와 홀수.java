class Solution {
    public String solution(int num) {
        String answer = new String();
        
        if(num % 2 == 0){
            answer = "Even";
        } else{
            answer = "Odd";
        }
        
        return answer;
    }
}
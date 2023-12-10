class Solution {
    public String[] solution(String my_string) {
        
        String answer1 = my_string.trim();
        
        String[] answer2 = answer1.split("\\s+");
        
        return answer2;
    }
}
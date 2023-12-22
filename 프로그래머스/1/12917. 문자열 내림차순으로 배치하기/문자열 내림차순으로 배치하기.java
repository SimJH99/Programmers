import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = new String();
        String[] reverse = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            reverse[i] = Character.toString(ch);
        }
        
        Arrays.sort(reverse ,Comparator.reverseOrder());

        for(int i =0; i< reverse.length; i++){
            answer += reverse[i];
        }
        
        return answer;
    }
}
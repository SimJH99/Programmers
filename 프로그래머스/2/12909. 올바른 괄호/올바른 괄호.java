import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Queue<Character> myQueue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')' && myQueue.isEmpty()){
                answer = false;
                break;
            } else {
                if (ch == '(') {
                    myQueue.add('(');
                } else if (ch == ')') {
                    myQueue.poll();
                }
            }
            
            if(myQueue.isEmpty()){
                answer = true;
            } else {
                answer = false;
            }
        }
        
        

        return answer;
    }
}
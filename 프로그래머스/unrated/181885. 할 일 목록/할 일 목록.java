import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List <String> result = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                result.add(todo_list[i]);
            }
        }
        
        String[] answer = result.toArray(new String[0]);
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        
        int length = 0;
        
        for(int i = 0; i < names.length; i+=5) {
            answer.add(names[i]);
        }
        
        return answer.toArray(new String[0]);
    }
}

// 0, 5, 10, 15, 20, 25
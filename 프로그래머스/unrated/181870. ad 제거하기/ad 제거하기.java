import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List <String> result = new ArrayList<>(); 
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                result.add(strArr[i]);
            }
        }
        
        String[] answer = new String[result.size()];
        
        for(int i = 0; i< answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
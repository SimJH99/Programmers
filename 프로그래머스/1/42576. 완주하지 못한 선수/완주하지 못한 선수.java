import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {   
        Map <String, Integer> myMap = new HashMap<>();
        Map<String, Integer> participant_map = new HashMap<>();

        for(String a : participant){
            myMap.put(a, myMap.getOrDefault(a, 0)+1);
        }
        for(String a : completion){
            if(myMap.get(a) == 1){
                myMap.remove(a);
            } else {
                myMap.put(a, myMap.get(a)-1);
            }
        }
        String answer = myMap.keySet().iterator().next();
        
        
        return answer;
    }
}
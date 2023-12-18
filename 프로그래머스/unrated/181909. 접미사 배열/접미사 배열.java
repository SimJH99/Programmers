import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        List<String> myList = new ArrayList<>();
        
        for(int i =0; i< my_string.length(); i++){
            myList.add(my_string.substring(i));
            
        }
        
        String[] answer = new String[myList.size()];
        myList.toArray(answer);
        Arrays.sort(answer);
    
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x+", -1);
        
        List<String> myList = new ArrayList<>(Arrays.asList(result));
        for(int i =0; i < myList.size(); i++){
            if(myList.get(i).equals("")){
                myList.remove(i);
            }
        }
        
        String[] answer = myList.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}
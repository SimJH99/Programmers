import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        
        
        String myCheck = myStr.replaceAll("a|b|c", "");
        if(myCheck.isEmpty()){
            String[] answer = {"EMPTY"};
            return answer;
        } else {
            String[] result = myStr.split("a|b|c");

            List<String> myList = new ArrayList<>(Arrays.asList(result));

            myList.removeAll(Arrays.asList(""));

            String[] answer = new String[myList.size()];

            for(int i = 0; i < myList.size(); i++){
                answer[i] = myList.get(i);
            }
            return answer;
        }
       
    }
}
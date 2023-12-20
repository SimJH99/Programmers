import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> myList = new ArrayList<>();

        for(int i =0; i < my_string.length(); i++){
            char my_char = my_string.charAt(i);
            myList.add(Character.toString(my_char));
        }

        Arrays.sort(indices);

        for(int i = indices.length-1; i >= 0; i--){
            myList.remove(indices[i]);
        }

        String answer = new String();

        for (int i = 0; i < myList.size(); i++){
            answer += myList.get(i);
        }
        
        
        return answer;
    }
}
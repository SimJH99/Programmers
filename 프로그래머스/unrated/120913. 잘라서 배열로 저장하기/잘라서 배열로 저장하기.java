import java.util.*;
class Solution {
        public String[] solution(String my_str, int n) {
        List<String> result = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < my_str.length(); i+=n){
            if ((i+n) <= my_str.length()){
                result.add(my_str.substring(i, i+n));
                count++;
            } else {
                result.add(my_str.substring(i, my_str.length()));
            }
        }
        
        String[] answer = new String[result.size()];

        int count1 =0;
        for(String a : result){
            answer[count1] = a;
            count1++;
        }
        return answer;
    }
}
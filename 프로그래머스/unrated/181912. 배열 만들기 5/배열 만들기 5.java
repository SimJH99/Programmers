import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> myList = new ArrayList<>();
        
        
        
        
        for(int i = 0 ; i < intStrs.length; i++){
            String str = new String();
            for(int j = s; j < s+l; j++){
                char ch = intStrs[i].charAt(j);
                str += ch;
            }
            
            int temp = 0;
            temp = Integer.parseInt(str);
            
            if(temp > k){
                myList.add(temp);
            }
        }
        
        int[] answer = new int[myList.size()];
        
        for(int i = 0; i < myList.size(); i++){
            answer[i] = myList.get(i);
        }
        
        return answer;
    }
}
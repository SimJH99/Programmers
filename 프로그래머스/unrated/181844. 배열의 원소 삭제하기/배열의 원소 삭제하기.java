import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> delList = new ArrayList<>();
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < delete_list.length; i++){
            delList.add(delete_list[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(!delList.contains(arr[i])){
                arrList.add(arr[i]);
            }
        }

        int[] answer = new int [arrList.size()];

        for(int i =0; i< arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        
        
        return answer;
    }
}
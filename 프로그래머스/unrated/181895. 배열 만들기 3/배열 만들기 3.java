import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List <Integer> myList = new ArrayList<>();
        
        for(int i =0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                myList.add(arr[j]);
            }
        }
        
        int[] answer = new int[myList.size()];
        
        for(int i =0; i < myList.size(); i++){
            answer[i] += myList.get(i);
        }
        
        return answer;
    }
}
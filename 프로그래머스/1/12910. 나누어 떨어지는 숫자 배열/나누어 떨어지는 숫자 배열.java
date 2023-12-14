import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        
        if(result.isEmpty()){
           int[] answer1 = {-1};
            return answer1;
        } else {
            for(int i =0; i < result.size(); i++){
                answer[i] = result.get(i);
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}
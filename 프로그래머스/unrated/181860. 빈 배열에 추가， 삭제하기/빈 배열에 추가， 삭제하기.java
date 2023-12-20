import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> X = new ArrayDeque<>();

        for(int i = 0; i< arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]; j++){
                    X.addLast(arr[i]);
                    X.addLast(arr[i]);

                }
            } else {
                for(int k = 0; k < arr[i]; k++){
                    X.pollLast();
                }
            }
        }

        int[] answer = new int[X.size()];

        for (int i = 0; i < answer.length; i++){
            answer[i] = X.pop();
        }
        return answer;
    }
}
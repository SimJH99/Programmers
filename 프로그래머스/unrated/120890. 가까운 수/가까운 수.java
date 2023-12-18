import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        int diff = 0;
        Arrays.sort(array);

        for(int i = 0; i< array.length; i++){
            diff = Math.abs(n - array[i]);
            if(diff < min){
                min = diff;
                answer = array[i];
            }
        }

        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        int count = 0;

        for(int i =0; i< arr.length; i++)
        {
            if(count == r){
                answer += arr[i];
                count++;
            } else if(count != r) {
                count++;
            }

            if(count == q){
                count = 0;
            }
        }
        return answer;
    }
}
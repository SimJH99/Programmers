import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = new String();
        String[] numberStr = new String[numbers.length];

        for(int i = 0; i<numbers.length; i++){
            numberStr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(numberStr, (((o1, o2) -> (o2+o1).compareTo(o1+o2))));

        for(int i =0; i < numberStr.length; i++){
            answer += numberStr[i];
        }
        
        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        
        return answer;
    }
}
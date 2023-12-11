import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[100000];
        
        Arrays.sort(numbers);
        int count = 0;
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                result[count] = numbers[i] + numbers[j];
                count++;
            }
        }
        
        int[] answer = Arrays.copyOfRange(result, 0, count);
        
        Arrays.sort(answer);
        int index = 0;
        int[] new_temp = new int[answer.length];
        for(int i = 0; i < answer.length; i++) {
            if(i==answer.length-1){
                new_temp[index] = answer[i];
                index++;
                break;
            }
            if(answer[i] != answer[i+1]) {
                new_temp[index] = answer[i];
                index++;
            }
        }
        int[] answer1 = Arrays.copyOfRange(new_temp,0,index);
        
        return answer1;
    }
}
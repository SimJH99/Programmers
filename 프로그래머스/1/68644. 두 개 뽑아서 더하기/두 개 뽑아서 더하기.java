import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
         List<Integer> num_list = new ArrayList<>();


        for(int i =0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(!num_list.contains(numbers[i]+numbers[j]))
                num_list.add(numbers[i] + numbers[j]);
            }
        }

        Collections.sort(num_list);
        int[] answer = new int[num_list.size()];
        for(int i = 0; i< num_list.size(); i++){
            answer[i] = num_list.get(i);
        }
        
        return answer;
    }
}
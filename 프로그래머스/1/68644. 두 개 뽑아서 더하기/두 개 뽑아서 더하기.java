import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> myTreeSet = new TreeSet<>();
        
        for(int i =0; i<numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                myTreeSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[myTreeSet.size()];
        int count = 0;
        for(int a : myTreeSet){
            answer[count] = a;
            count++;
        }
        return answer;
        
        
//          List<Integer> num_list = new ArrayList<>();

//         for(int i =0; i < numbers.length-1; i++){
//             for(int j = i+1; j < numbers.length; j++){
//                 if(!num_list.contains(numbers[i]+numbers[j]))
//                 num_list.add(numbers[i] + numbers[j]);
//             }
//         }

//         Collections.sort(num_list);
//         int[] answer = new int[num_list.size()];
//         for(int i = 0; i< num_list.size(); i++){
//             answer[i] = num_list.get(i);
        // }
        
        // return answer;
    }
}
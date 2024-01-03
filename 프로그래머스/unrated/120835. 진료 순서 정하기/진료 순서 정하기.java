import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> myList = new ArrayList<>();

        for(int a : emergency){
            myList.add(a);
        }

        Collections.sort(myList, Collections.reverseOrder());

        int count =0;

        for (int i =0; i < emergency.length; i++){
            answer[count] = myList.indexOf(emergency[i])+1;
            count++;
        }
        return answer;
    }
}
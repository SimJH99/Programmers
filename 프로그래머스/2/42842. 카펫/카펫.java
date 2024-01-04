import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];
        List<Integer> myList = new ArrayList<>();

        for (int i =1; i<= total; i++){
            if(total % i == 0){
                myList.add(i);
            }
        }

        if (myList.size() % 2 == 0){
            answer[0] = myList.get(myList.size()/2);
            answer[1] = myList.get(myList.size()/2-1);
        } else {
            answer[0] = myList.get(myList.size()/2);
            answer[1] = myList.get(myList.size()/2);
        }

        for(int i =0 ; i< myList.size()/2; i++){
            if (myList.size() % 2 == 0){
                answer[0] = myList.get(myList.size()/2+i);
                answer[1] = myList.get(myList.size()/2-i-1);
                if (yellow != (answer[0]-2) * (answer[1]-2)){
                    continue;
                } else {
                    break;
                }
            } else {
                answer[0] = myList.get(myList.size()/2);
                answer[1] = myList.get(myList.size()/2);
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = Integer.MAX_VALUE;
        List<Integer> mylist = new ArrayList<>();
        
        if(arr.length <= 1){
            answer = new int[1];
            answer[0] = -1;
        } else {
            for(int a : arr){
                mylist.add(a);
                if(a < min){
                    min = a;
                }
            }

            for(int i =0; i < mylist.size(); i++){
                if(mylist.get(i).equals(min)){
                    mylist.remove(i);
                    break;
                }
            }

            answer = new int[mylist.size()];

            for(int i = 0; i< mylist.size(); i++){
                answer[i] = mylist.get(i);
            }
        }
        
        return answer;
    }
}
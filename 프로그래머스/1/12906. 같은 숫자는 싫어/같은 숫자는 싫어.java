import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> myStack = new Stack<>();
        List<Integer> myList = new ArrayList<>();

        if (myStack.isEmpty()){
            myStack.add(arr[0]);
        }


        for (int i = 1; i < arr.length; i++){
            if (arr[i] != myStack.peek()) {
                myList.add(myStack.pop());
                myStack.add(arr[i]);
            }
        }
        myList.add(myStack.pop());
        
        int[] answer = new int[myList.size()];
        int count =0;
        for (int a : myList){
            answer[count] = a;
            count++;
        }

        return answer;
    }
}
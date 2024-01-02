import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> myList = new ArrayList<>();
        
        for(int x : num_list){
            myList.add(x);
        }

        List<Integer> answerList = new ArrayList<>();

        switch (n){
            case 1:
                for(int i =0; i <= b; i++){
                    answerList.add(myList.get(i));
                }

                answer = new int[answerList.size()];
                
                for (int i =0; i< answerList.size(); i++){
                    answer[i] = answerList.get(i);
                }
                break;

            case 2:
                for(int i =a; i < num_list.length; i++){
                    answerList.add(myList.get(i));
                }

                answer = new int[answerList.size()];
                
                for (int i =0; i< answerList.size(); i++){
                    answer[i] = answerList.get(i);
                }
                break;
            case 3:
                for(int i =a; i <= b; i++){
                    answerList.add(myList.get(i));
                }

                answer = new int[answerList.size()];
                
                for (int i =0; i< answerList.size(); i++){
                    answer[i] = answerList.get(i);
                }
                break;

            case 4:
                for(int i =a; i <= b; i+= c){
                    answerList.add(myList.get(i));
                }

                answer = new int[answerList.size()];
                
                for (int i =0; i< answerList.size(); i++){
                    answer[i] = answerList.get(i);
                }
                break;
        }
        return answer;
    }
}
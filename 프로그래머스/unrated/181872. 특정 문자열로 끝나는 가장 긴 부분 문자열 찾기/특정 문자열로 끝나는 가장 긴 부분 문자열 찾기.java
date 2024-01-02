import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        List<String> myList = new ArrayList<>();
        for(int i =1; i <= myString.length(); i++){
            myList.add(myString.substring(0,i));
        }

        List<String> myAnswer = new ArrayList<>();
        for(int i =0; i < myList.size(); i++){
            if(myList.get(i).contains(pat)){
                myAnswer.add(myList.get(i));
            }
        }

        int maxLength =0;
        String answer = new String();
        for(int i =0 ; i< myAnswer.size(); i++){
            String last = myAnswer.get(i).substring(myAnswer.get(i).length()-pat.length(),myAnswer.get(i).length());
            if(last.equals(pat) && myAnswer.get(i).length() > maxLength){
                maxLength = myAnswer.get(i).length();
                answer = myAnswer.get(i);
            }
        }
        
        
        return answer;
    }
}
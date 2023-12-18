import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = new String();

        Map<String, String> myMap = new HashMap<>();
        myMap.put(".-","a");
        myMap.put("-...","b");
        myMap.put("-.-.","c");
        myMap.put("-..","d");
        myMap.put(".","e");
        myMap.put("..-.","f");
        myMap.put("--.","g");
        myMap.put("....","h");
        myMap.put("..","i");
        myMap.put(".---","j");
        myMap.put("-.-","k");
        myMap.put(".-..","l");
        myMap.put("--","m");
        myMap.put("-.","n");
        myMap.put("---","o");
        myMap.put(".--.","p");
        myMap.put("--.-","q");
        myMap.put(".-.","r");
        myMap.put("...","s");
        myMap.put("-","t");
        myMap.put("..-","u");
        myMap.put("...-","v");
        myMap.put(".--","w");
        myMap.put("-..-","x");
        myMap.put("-.--","y");
        myMap.put("--..","z");

        String[] letterArr = letter.split(" ");

        for(int i = 0; i < letterArr.length; i++){
            for(int j = 0; j < myMap.size(); j++){
                if(myMap.containsKey(letterArr[i])){
                    answer += myMap.get(letterArr[i]);
                    break;
                }
            }
        }
        return answer;
    }
}
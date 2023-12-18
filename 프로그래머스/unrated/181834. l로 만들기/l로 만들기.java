class Solution {
    public String solution(String myString) {
        //a 부터 k까지
        String answer = new String();
        
        for(int i = 0; i < myString.length(); i++){
            char myChar = myString.charAt(i);
            if(myChar >= 'a' && myChar <= 'k'){
                answer += 'l';
            } else {
                answer += myChar;
            }
        }
        
        return answer;
    }
}
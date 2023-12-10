class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String myStr = new String();
        
        for(int i = 0; i < myString.length(); i++) {
            char myChar = myString.charAt(i);
            if(myChar == 'A'){
                myStr += 'B';
            } else if(myChar == 'B'){
                myStr += 'A';
            }
        }
        
        if(myStr.contains(pat)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}
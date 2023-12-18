class Solution {
    public int[] solution(String myString) {
        
        String[] stArr = myString.split("x", -1);
        
        int[] answer = new int[stArr.length];
        
        for(int i = 0; i < stArr.length; i++){
            answer[i] = stArr[i].length();
        }
        return answer;
    }
}
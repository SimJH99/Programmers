class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i =0; i< array.length; i++){
            String temp = String.valueOf(array[i]);
            for(int j =0; j< temp.length();j++){
                char ch = temp.charAt(j);
                if(ch == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}
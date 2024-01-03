class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int size = myString.length()-pat.length();

        String[] myArr = new String[size + 1];

        for(int i = 0; i <= size; i++){
            String myStr = myString.substring(i, i+pat.length());
            myArr[i] = myStr;
        }
        
        for (int i =0; i < myArr.length; i++){
            if(myArr[i].equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}
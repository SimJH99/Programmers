class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = new String();
        
        String temp = new String();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].contains(ex)){
                temp = str_list[i];
            } else {
                answer += str_list[i];
            }
        }
        
        return answer;
    }
}
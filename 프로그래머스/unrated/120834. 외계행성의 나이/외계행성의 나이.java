class Solution {
    public String solution(int age) {
        String answer = new String();
        
        String str_age = Integer.toString(age);
        
        for(int i = 0; i < str_age.length(); i++) {
            char char_age = str_age.charAt(i);
            if(char_age >= '0' && char_age <= '9'){
                char_age += 49;
                answer += char_age;
            }
        }
        
        return answer;
    }
}
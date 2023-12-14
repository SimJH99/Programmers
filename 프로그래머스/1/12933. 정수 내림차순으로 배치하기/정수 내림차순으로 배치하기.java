import java.util.*;
class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String reverse = new String();

        for(int i =0; i < chars.length; i++){
            reverse += chars[chars.length-1-i];
        }
        
        long answer = Long.parseLong(reverse);
        return answer;
    }
}
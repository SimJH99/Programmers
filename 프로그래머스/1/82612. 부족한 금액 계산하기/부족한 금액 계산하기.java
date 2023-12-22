import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long priceTemp = 0;
        long result = money;
        
        for(int i =1; i <= count; i++){
            priceTemp = price * i;
            result -= priceTemp;
        }
        
        if(result >= 0){
            answer = 0;
        } else {
            answer = Math.abs(result);
        }
        

        return answer;
    }
}
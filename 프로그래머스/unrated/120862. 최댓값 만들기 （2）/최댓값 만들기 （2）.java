import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int min_mul = numbers[0] * numbers[1];
        
        int max_mul = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        answer = (min_mul > max_mul) ? min_mul : max_mul;
        
        return answer;
    }
}
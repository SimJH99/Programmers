import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger num3 = num1.add(num2);

        String answer = num3.toString();
        return answer;
    }
}
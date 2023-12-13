class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] bino = binomial.split(" ");

        int a = Integer.parseInt(bino[0]);
        String op = bino[1];
        int b = Integer.parseInt(bino[2]);

        if(op.equals("+")){
            answer = a + b;
        } else if(op.equals("-")){
            answer = a - b;
        } else{
            answer = a * b;
        }
        
        return answer;
    }
}
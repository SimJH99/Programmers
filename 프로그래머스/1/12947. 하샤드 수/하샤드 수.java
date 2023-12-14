class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String xStr = Integer.toString(x);

        int sum = 0;
        for(int i =0; i< xStr.length(); i++){
            char ch = xStr.charAt(i);
            sum += (int)(ch - '0');
        }
        
        if(x % sum == 0){
            answer = true;
        } else{
            answer = false;
        } 
        
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String test = s.toUpperCase();
        
        int Pcount = 0;
        int Ycount =0;
        
        for(int i = 0; i < test.length(); i++){
            char sChar = test.charAt(i);
            if(sChar == 'P'){
                Pcount++;
            } else if(sChar == 'Y'){
                Ycount++;
            }
        }
        
        if(Pcount == Ycount){
            answer = true;
        } else{
            answer = false;
        }
        

        return answer;
    }
}
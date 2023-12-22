class Solution {
    public int[] solution(int[] arr) {
        int a = 1;
        int length = 0;
        
        if(arr.length == 1){
            length = 1;
        } else {
            while (arr.length > a){
                a *= 2;
                length = a;
            }
    
        }
        
        int[] answer = new int[length];

        for(int i =0; i < length; i++){
            if(i < arr.length){
                answer[i] = arr[i];
            } else{
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}
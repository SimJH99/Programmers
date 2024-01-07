class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;

        for(int i = 0; i < sizes.length; i++){
            int temp = 0;
            int w = sizes[i][0];
            int h = sizes[i][1];
            if(h > w){
                temp = w;
                w = h;
                h = temp;
            }

            if(w > maxW){
                maxW = w;
            }

            if(h > maxH){
                maxH = h;
            }
        }

        answer = maxW * maxH;
        
        return answer;
    }
}
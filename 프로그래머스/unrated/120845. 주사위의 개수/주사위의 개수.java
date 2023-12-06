class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int witdh = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;
        
        answer = witdh * length * height;
        
        return answer;
    }
}
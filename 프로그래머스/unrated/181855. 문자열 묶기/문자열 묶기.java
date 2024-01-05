class Solution {
    public int solution(String[] strArr) {
        int[] lenthArr = new int[strArr.length];

        for(int i =0; i < strArr.length; i++){
            lenthArr[i] = strArr[i].length();
        }

        int[] count = new int[30];

        for(int i = 0; i < lenthArr.length; i++){
            count[lenthArr[i]-1]++;
        }

        int max = Integer.MIN_VALUE;

        for (int i =0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        int answer = max;
        return answer;
    }
}
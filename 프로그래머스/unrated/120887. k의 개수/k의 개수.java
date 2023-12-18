class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String a = new String();
        
        for(int x = i; x <= j; x++){
            a += Integer.valueOf(x);
        }

        char[] arrs = a.toCharArray();

        for(int y = 0; y < arrs.length; y++){
            if(arrs[y] == (char)(k+'0')){
                answer++;
            }
        }

        return answer;
    }
}
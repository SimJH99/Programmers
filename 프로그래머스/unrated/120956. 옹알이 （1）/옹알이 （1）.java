import java.util.*;

class Solution {
    static boolean[] visited;
    static List<List<String>> result;
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> myList = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        List<String> temp = new ArrayList<>();
        visited = new boolean[myList.size()];
        result = new ArrayList<>();

        for(int i = 1; i <= myList.size(); i++){
            permutation(myList, visited, result, temp, i);
        }

        String[] strArr = new String[result.size()];

        int count = 0;

        for(int i =0; i< result.size(); i++){
            String str = new String();
            for(int j =0; j < result.get(i).size(); j++){
                str += result.get(i).get(j);
            }
            strArr[count] = str;
            count++;
        }

        for(int i =0; i < strArr.length; i++){
            for(int j =0; j < babbling.length; j++){
                if(strArr[i].equals(babbling[j])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    static void permutation(List<String> myList, boolean[] visited, List<List<String>> result, List<String> temp, int n){
        if(temp.size() == n){
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i =0; i < myList.size(); i++){
            if(visited[i] == false){
                visited[i] = true;
                temp.add(myList.get(i));
                permutation(myList, visited, result, temp, n);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}
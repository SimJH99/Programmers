import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            myList.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                myList.get(i).add(arr[i][j]);
            }
        }

        int row = myList.size();
        int column = myList.get(0).size();

        if(row > column){
            for (int i = 0; i < row; i++) {
                if (column != row) {
                    while (myList.get(i).size() != row) {
                        myList.get(i).add(0);
                    }
                }
            }
        } else if(row < column) {
            for (int i = row; i < column; i++) {
                if (column != row) {
                    myList.add(new ArrayList<>());
                    while (column != myList.get(i).size()){
                        for(int j =0; j < column; j++){
                            myList.get(i).add(0);
                        }
                    }
                }
            }
        }

        int[][] answer = new int[myList.size()][myList.size()];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                answer[i][j] = myList.get(i).get(j);
            }
        }
        return answer;
    }
}
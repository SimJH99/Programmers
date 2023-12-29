class Solution {
    static boolean[] static_visited;
    static int[][] static_graph;
    static int count;
    
    public int solution(int n, int[][] computers) {
        static_graph = computers;
        static_visited = new boolean[static_graph.length];

        for (int i =0; i < computers.length; i++){
            DFS(i);
        }

        int count1 = count;
        int answer = n - count1;
        
        return answer;
    }
    
    static void DFS(int start){
        static_visited[start] = true;
        for (int i =0; i< static_graph[start].length; i++){
            if(!static_visited[i] && static_graph[start][i] == 1){
                count++;
                DFS(i);
            }
        }
    }
}
package dfs_graph;

import java.util.LinkedList;

public class DFSGraph {
    private LinkedList<Integer>[] list;
    public boolean[] visited;

    public DFSGraph(int vertices){
        list = new LinkedList[vertices+1];
        visited = new boolean[vertices+1];

        for(int i = 1; i <= vertices; i++){
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest){
        list[src].add(dest);
        list[dest].add(src);
    }

    public void dfs(int node){
        visited[node] = true;
        System.out.print(node+" ");

        for(int neighbour : list[node]){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
}

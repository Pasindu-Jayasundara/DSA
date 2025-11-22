package dfs_graph;

public class Main {
    public static void main(String[] args) {

        DFSGraph graph = new DFSGraph(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

        graph.dfs(1);
    }
}

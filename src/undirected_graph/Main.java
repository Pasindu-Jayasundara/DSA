package undirected_graph;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int V = 5;

        //list of edges (u,v)
        // A=0, B=1, C=2, D=3, E=4
        int[][] edges = {
                {0,1},
                {0,3},
                {1,3},
                {1,2},
                {1,4},
                {2,4},
                {3,4},
        };

        //build the graph using edges
        ArrayList<ArrayList<Integer>> mat = Graph.createGraph(V, edges);

        System.out.println("Adjacency Matrix Representation :");
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

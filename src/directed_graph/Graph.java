package directed_graph;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {

    static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        // initialize the matrix with 0
        for(int i = 0; i < V; i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V, 0));
            mat.add(row);
        }

        // add each edge to the adjacency matrix
        for(int[] it: edges){
            int u = it[0];
            int v = it[1];

            mat.get(u).set(v,1);
        }

        return mat;
    }
}

package dijktras_algorithm;

public class Main {
    public static void main(String[] args) {
        // adjacency matrix for the given graph (0 = no edge)
        DA g =  new DA();

        int graph[][] = new int[][]{
                // v1 v2 v3 v4 v5 v6 v7 v8 v9
                {   0, 4, 0, 0, 0, 0, 0, 8, 0}, //v1
                {   4, 0, 8, 0, 0, 0, 0,11, 0}, //v2
                {   0, 8, 0, 7, 0, 4, 0, 0, 2}, //v3
                {   0, 0, 7, 0, 9,14, 0, 0, 0}, //v4
                {   0, 0, 0, 9, 0,10, 0, 0, 0}, //v5
                {   0, 0, 4,14,10, 0, 2, 0, 0}, //v6
                {   0, 0, 0, 0, 0, 2, 0, 1, 6}, //v7
                {   8,11, 0, 0, 0, 0, 1, 0, 7}, //v8
                {   0, 0, 2, 0, 0, 0, 6, 7, 0} //v9
        };

        g.dijkstra(graph,0); // source is v1 (index 0)
    }
}

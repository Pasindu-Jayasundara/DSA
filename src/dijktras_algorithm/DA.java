package dijktras_algorithm;

public class DA {
    static final int V = 9; // number of vertices

    // find vertex with minimum distance not yet processed
    static int minDistance(int dist[],boolean visited[]){
        int min = Integer.MAX_VALUE, minIndex = -1;
        for(int v = 0; v < V; v++){
            if(!visited[v] && dist[v] <= min){
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // print shortest distances from source
    static void printSolution(int dist[]){
        System.out.print("Vertex\tDistance from V1");
        for(int i = 0; i < V; i++){
            System.out.print("V" + (i+1) + "\t\t" + dist[i]);
        }
    }

    // dijkstra algorithm
    static void dijkstra(int graph[][], int src){
        int dist[] = new int[V];
        boolean[] visited = new boolean[V];

        // initialize distances
        for(int i = 0; i < V; i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // find shortest path
        for(int count = 0; count < V-1; count++){
            int u = minDistance(dist, visited);
            visited[u] = true;

            for(int v = 0; v < V; v++){
                if(!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]
                ){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }
}

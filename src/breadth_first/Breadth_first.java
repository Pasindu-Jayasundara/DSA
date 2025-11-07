package breadth_first;

import java.util.*;

public class Breadth_first {

    private Map<Character, List<Character>> adjList;

    public Breadth_first() {
        adjList = new HashMap<>();

        // build the graph (based on the image)
        adjList.put('A', Arrays.asList('B','C','D'));
        adjList.put('B', Arrays.asList('E','F'));
        adjList.put('C', Arrays.asList('G','H'));
        adjList.put('D', Arrays.asList('H'));
    }

    public void bfs(char start){
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");
        while(!queue.isEmpty()){
            char current = queue.poll();
            System.out.print(current + " ");

            for(char neighbour: adjList.getOrDefault(current,new ArrayList<>())){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}

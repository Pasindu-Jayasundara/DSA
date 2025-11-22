package dfs_tree;

import java.util.*;

public class DFSTree {

    private Map<Character,List<Character>> list = new HashMap<>();
    private Set<Character> visited = new HashSet<>();

    public void addEdges(char src, char dest){
        list.putIfAbsent(src, new ArrayList<>());
        list.putIfAbsent(dest, new ArrayList<>());
        list.get(src).add(dest);
        list.get(dest).add(src);
    }

    public void dfs(char node){
        visited.add(node);
        System.out.print(node+" ");
        for(char neighbour : list.get(node)){
            if(!visited.contains(neighbour)){
                dfs(neighbour);
            }
        }
    }
}

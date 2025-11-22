package dfs_tree;

public class Main {
    public static void main(String[] args) {

        DFSTree tree = new  DFSTree();
        tree.addEdges('A','B');
        tree.addEdges('A','C');
        tree.addEdges('A','D');
        tree.addEdges('B','E');
        tree.addEdges('B','F');
        tree.addEdges('C','G');
        tree.addEdges('C','H');
        tree.addEdges('D','H');

        tree.dfs('A');
    }
}

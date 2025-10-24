package binary_tree;

public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        int[] values = {1,2,3,4,5,6,7,8,9,10};
        bt.root = bt.buildTree(values);

        bt.inOrder(bt.root);
    }
}

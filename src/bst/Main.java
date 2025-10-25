package bst;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(50);
        bst.insert(60);
        bst.insert(70);
        bst.insert(80);

        System.out.println("Inorder :");
        bst.inOrder();
//        System.out.println(bst.search(30));
    }
}

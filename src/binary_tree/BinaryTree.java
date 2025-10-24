package binary_tree;

import java.util.*;

public class BinaryTree {

    Node root;

    public Node buildTree(int[] values){
        if(values.length != 0){

            Node root =  new Node(values[0]);
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            int i = 1;
            while(i < values.length){

                Node current = queue.poll();

                // left
                if(i < values.length){
                    current.left = new Node(values[i++]);
                    queue.add(current.left);
                }

                // right
                if(i < values.length){
                    current.right = new Node(values[i++]);
                    queue.add(current.right);
                }
            }
        }else{
            return null;
        }
        return root;
    }

    public void inOrder(Node node) {
        if (node != null) {

            // traverse left subtree
            inOrder(root.left);
            System.out.print(node.data + " ");

            // traverse right subtree
            inOrder(node.right);
        }else{
            System.out.println("Node is empty");
        }
    }
}

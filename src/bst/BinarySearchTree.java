package bst;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    // insert
    public void insert(int value){
        root = insertRecord(root,value);
    }

    Node insertRecord(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertRecord(root.left,key);
        }else if(key > root.key){
            root.right = insertRecord(root.right,key);
        }
        return root;
    }

    // search
    public boolean search(int value){
        return searchRecord(root, value);
    }

    public boolean searchRecord(Node root, int key){
        if(root == null){
            return false;
        }else if(root.key == key){
            return true;
        }else if(key < root.key){
            return searchRecord(root.left,key);
        } else{
            return searchRecord(root.right,key);
        }
    }

    // delete
    public void delete(int value){
        root = deleteRecord(root,value);
    }

    public Node deleteRecord(Node root, int key){
        if(root == null){
            return root;
        }

        if(key < root.key){
            root.left = deleteRecord(root.left,key);
        }else if(key > root.key){
            root.right = deleteRecord(root.right,key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRecord(root.right,root.key);
        }
        return root;
    }

    public int minValue(Node root){
        int min = root.key;
        while(root.left != null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    // inorder(left, root, right)
    public void inOrder(){
        inOrderRecords(root);
        System.out.println();
    }

    public void inOrderRecords(Node root){
        if(root != null){
            inOrderRecords(root.left);
            System.out.print(root.key + " ");
            inOrderRecords(root.right);
        }
    }

    // preOrder(root, left, right)
    public void preOrder(){
        preOrderRecords(root);
        System.out.println();
    }

    public void preOrderRecords(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preOrderRecords(root.left);
            preOrderRecords(root.right);
        }
    }


    // postOrder(left, right, root)
    public void postOrder(){
        postOrderRecords(root);
        System.out.println();
    }

    public void postOrderRecords(Node root){
        if(root != null){
            preOrderRecords(root.left);
            preOrderRecords(root.right);
            System.out.print(root.key + " ");
        }
    }
}

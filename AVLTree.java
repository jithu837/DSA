class Node{
    int data;
    Node left;
    int height;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
        height = 1; // leaf node height
    }
}
class treeMethods{
    Node root;
    int height(Node n){
        if(n==null) return 0;
        return n.height;
    }
    int getBalance(Node n){
        if(n==null) return 0;
        return height(n.left)-height(n.right);
    }
    Node rightRotate(Node y){
        Node x=y.left;
        Node T2=x.right;
        x.right=y;
        y.left=T2;
        y.height=Math.max(height(y.left),height(y.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;
        return x;
    }
    Node leftRotate(Node z){
        Node x=z.right;
        Node T1=x.left;
        x.left=z;
        z.right=T1;
        z.height=Math.max(height(z.right),height(z.left))+1;
        x.height=Math.max(height(x.right),height(x.left))+1;
        return x;
    }
    Node insert(Node node, int key){
        if(node==null) return new Node(key);
        if(key < node.data)
            node.left = insert(node.left, key);
        else if(key > node.data)
            node.right = insert(node.right, key);
        else
            return node; // no duplicates
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);
        // Left Left
        if(balance > 1 && key < node.left.data)
            return rightRotate(node);
        // Right Right
        if(balance < -1 && key > node.right.data)
            return leftRotate(node);
        // Left Right
        if(balance > 1 && key > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left
        if(balance < -1 && key < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;   
    }
    public void insert(int key){
        root = insert(root, key);
    }
    public void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
}
public class AVLTree {
    public static void main(String[] args) {
        treeMethods tm=new treeMethods();
        int[] keys = {8,2,4,12,3,7,9};
        for(int key: keys) tm.insert(key);
        System.out.print("In-order traversal: ");
        tm.inOrder(tm.root);
        System.out.println();
    }
}
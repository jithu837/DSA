class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    Node root;

    BinaryTree() {
        this.root=null;
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public int countOfNode(Node node){
        if(node==null){
            return 0;
        }
        return 1 +countOfNode(node.left) + countOfNode(node.right);
    }
    public int find (Node node){
        if(node==null){
            return 0;
        }
        return 1 + Math.max(find(node.left),find(node.right));
    }
    public int sumNode(Node node){
        if(node==null) return 0;
        return node.data  + sumNode(node.left)+sumNode(node.right);
    }
    public int sumLeaf(Node node){
        if(node==null) return 0;
        if(node.left==null && node.right==null){
            return 1;
        }
        return sumLeaf(node.left)+sumLeaf(node.right);
    }
    public int deleteRoot(Node node){
        
    }
}
public class Trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root =  new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        int totalnodes=tree.countOfNode(tree.root);
        System.out.println(totalnodes);
        System.out.println(tree.find(tree.root));
        System.out.println(tree.sumNode(tree.root));
        System.out.println(tree.sumLeaf(tree.root));
    }
}


import javax.xml.validation.ValidatorHandler;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryST{
    Node root=null;
    public Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data>data){
            root.left=insert(root.left,data);

        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
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
    public  String search(Node root,int value){
        if(root==null){
            return "No data";
        } 
        if(root.data==value){
            return "found in root";
        }
        if(value<root.data){
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
        
    }
    public int minValue(Node root){
        if(root==null) return -1;
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
    public int maxValue(Node root){
        if(root==null) return -1;
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }
    //delete entire tree
    public void delete(){
        if(root==null){
            return;
        }
        root=null;
    }
    //delete values
    public  Node deleteByValue(Node root,int val)
    {
        if(root==null){
            return null;
        } 
       
        if(root.data<val){
            root.right= deleteByValue(root.right, val);
        }else if(root.data>val){
            root.left= deleteByValue(root.left, val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            int min=minValue(root.right);
            root.data=min;
            root.right=deleteByValue(root.right, min);

        }
        return root;
    
    }
    public void reflect(Node root){
        if(root==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        reflect(root.left);
        reflect(root.right);
    }
}
public class BSTree {
    public static void main(String[] args) {
        BinaryST bst=new BinaryST();
        bst.root=bst.insert(bst.root,5);
        bst.root=bst.insert(bst.root,3);
        bst.root=bst.insert(bst.root,1);
        bst.root=bst.insert(bst.root,10);
        bst.root=bst.insert(bst.root,15);
        bst.inOrder(bst.root);
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
        int[] arr={5,6,7,3,2,1};
        for(int i:arr){
        bst.root=bst.insert(bst.root,i);
      } 
      bst.inOrder(bst.root);
      System.out.println(bst.search(bst.root,55));
      System.out.println(bst.minValue(bst.root));
      System.out.println(bst.maxValue(bst.root));
      bst.deleteByValue(bst.root, 1);
      bst.deleteByValue(bst.root, 15);
      bst.deleteByValue(bst.root, 6);
      //bst.reflect(bst.root);
      bst.inOrder(bst.root);
      
    }
    

}
//1 3 5 10 15 
//5 3 1 10 15
//1 3 15 10 5
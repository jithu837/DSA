class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackLL{
    static Node top=null;
    public static void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top= newNode;
        
    }

    public static void pop(){
        if(top==null){
            System.out.println("no data");
            return;
        }
        System.out.println(top.data);
        top=top.next;

    }
    public static void peekvalue(){
        if(top==null){
            System.out.println("no data");
            return;
        }
        else{
            System.out.println(top.data);
        }
    }
    public static void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class StackLinkedList {
    public static void main(String[] args) {
        StackLL.push(20);
        StackLL.push(30);
        StackLL.push(40);
        StackLL.push(50);
        StackLL.display();
        StackLL.pop();
        StackLL.display();
        StackLL.peekvalue();
        StackLL.display();
        
    }
}

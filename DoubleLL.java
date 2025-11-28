class Node{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}
class dLLMethods{
    private Node head=null;
    private Node tail=null;
    public  void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(tail==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void insertAtFirst(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void forwardTraverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void backwardTraverse(){
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public void deleteAtLast()
    {
        if(tail==null){
            System.out.print("No data");
            return;
        }
        tail=tail.prev;
        
        if(tail!=null) tail.next=null;
        else head=null;
    }
    public void deleteAtFirst()
    {
        if(head==null){
            System.out.print("No data");
            return;
        }
        head=head.next;
        
        if(head!=null) head.prev=null;
        else tail=null;
    }
}
public class DoubleLL {
    public static void main(String[] args) {
        dLLMethods dlm=new dLLMethods();
        dlm.insertAtEnd(10);
        dlm.insertAtEnd(20);
        dlm.insertAtEnd(30);
        dlm.insertAtEnd(40);
        //dlm.forwardTraverse();
        //dlm.backwardTraverse();
        //dlm.deleteAtLast();
        //dlm.forwardTraverse();
        dlm.deleteAtFirst();
        dlm.forwardTraverse();
    }
    
}

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    static Node head;
    public static int count()
    {
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addfirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void insert(int data)
    {
        Node newNode=new Node(data);
        if(head!=null)
        {
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void reverseList(){
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public static boolean search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListOfFunctions ll=new ListOfFunctions();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.display();
        System.out.println("count"+ll.count());
        ll.reverseList();
        ll.display();
        
    }
}
//40->30->20->10->null
//count4
//10->20->30->40->null
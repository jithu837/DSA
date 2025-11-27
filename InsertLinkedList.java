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
}
public class InsertLinkedList {
    public static void main(String[] args) {
        ListOfFunctions ll=new ListOfFunctions();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.display();
        System.out.println("count"+ll.count());
    }
}
//40->30->20->10->null
//count4
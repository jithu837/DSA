class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SinglyCircularMethods{
    private Node head=null;
    public void insertEnd(int data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    public void insertFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void insertMiddle(int data,int pos){
        Node newnode=new Node(data);
        if(pos==1){
            insertFirst(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
            if(temp==head) return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deleteAtFirst()
    {
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
    }
    public void DeleteAtLast(){
         if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
    public void DeleteByPosition(int pos){
        if(head==null){
            System.out.println("No data");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        int count=0;
        while(count<pos-1 && temp.next!=head){
            temp=temp.next;
            count++;
        }
        if(temp.next==head){
            System.out.println("Position out of bounds");
            return;
        }
        temp.next=temp.next.next;
    }
    public void display(){
        if(head==null){
            System.out.print("No Data");
            return;
        }
        Node temp=head;
        do { 
            System.out.print(temp.data+"->");
            temp=temp.next;
        } while (temp!=head);
        System.out.println();
    }
}

public class e_SinglyCircular {
    public static void main(String[] args) {
        SinglyCircularMethods scm=new SinglyCircularMethods();
        scm.insertEnd(20);
        scm.insertEnd(40);
        scm.insertEnd(50);
        scm.insertEnd(10);
        scm.insertMiddle(35,2);
        scm.display();
        scm.deleteAtFirst();
        scm.display();
        scm.DeleteAtLast();
        scm.display();
        scm.DeleteByPosition(2);
        scm.display();
    }
}

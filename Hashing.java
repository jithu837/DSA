import java.util.LinkedList;

class HashCode{
    private int size=10;
    private LinkedList<Integer>[] table;
    HashCode(){
        table=new LinkedList[size];
        for(int i=0;i<size;i++){
            table[i]=new LinkedList<>();
        }
    }
    private int hash(int data){
        return data % size;
    }
    public void insert(int data){
        int index=hash(data);
        table[index].add(data);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
    public boolean search(int data){
        int index=hash(data);
        if(table[index].contains(data)){
            System.out.println("Data " + data + " found at index " + index);
            return true;
        }
        System.out.println("Data " + data + " not found");
        return false;
    }
    public void delete(int data){
        int index=hash(data);
        table[index].remove(Integer.valueOf(data));
    }
}

public class Hashing{
    public static void main(String[] args) {
        HashCode hc=new HashCode();
        hc.insert(25);
        hc.insert(35);
        hc.insert(45);
        hc.insert(50);
        System.out.println("Hash Table after insertions:");
        hc.display();
        System.out.println();
        hc.search(45);
        System.out.println();
        hc.delete(50);
        System.out.println("Hash Table after deleting 50:");
        hc.display();
    }
}
import java.util.*;
public class SameOrNotArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
        int arr1[]=new int[b];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            arr1[i]=sc.nextInt();
        }
        if(Arrays.equals(arr,arr1)){
                System.out.println("Same");
                }
                else{
                    System.out.println("Not Same");
                }
            }
            
}
    

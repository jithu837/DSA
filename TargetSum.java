public class TargetSum {
    public static void main(String[] args) {
        int target=10;
        int arr[] = {3,5,6,7,4,3,6,2};
        target(arr,target);

    
    }
public static void target(int[] arr, int tr ) {
    boolean status=false;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]+arr[j]==tr){
                status=true;
                System.out.println(arr[i]+"+"+arr[j]+"="+tr);
            }
        }
    }
    if(!status){
        System.out.println("Target Not found");
}
}
}

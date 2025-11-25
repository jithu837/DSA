public class InsertionSort {
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && min<arr[j]){
                arr[j+1]=arr[j];
                j--;
            } 
            arr[j+1]=min;
            }
        }
        
    
    public static void main(String[] args) {
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        System.out.println("before sort..");
        for(int j:arr){
            System.out.print(j+" ");
        }
        insertion(arr);
        System.out.println();
        System.out.println("after sort...");
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
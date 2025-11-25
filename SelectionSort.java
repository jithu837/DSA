public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            }
        }
        
    
    public static void main(String[] args) {
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        selectionSort(arr);
        for(int i:arr) System.out.print(i+" ");
    }

}
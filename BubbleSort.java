public class BubbleSort {
    public static int bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            for (Object k : arr) {
                System.out.print(k+" ");
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        System.out.println("before sort..");
        for(int j:arr){
            System.out.print(j+" ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("after sort...");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

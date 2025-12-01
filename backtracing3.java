public class backtracing3 {
    public static void subArrays(int[] arr,int index){
        if(index==arr.length){
            for(int num:arr){
                System.out.print(num+"");
            }
        System.out.println();
        return;
        }
        for(int j=index;j<arr.length;j++){
            int temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
            subArrays(arr, index+1);
            temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
        }    
    }
    public static void main(String[] args) {
        String str="ABC";
        subArrays(str, 0);
    }
}

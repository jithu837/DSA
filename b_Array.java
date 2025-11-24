public class b_Array {
    public static void main(String[] args) {
        int[] arr={8,3,5,4,7,0,4,1,9,2};
        int target=9;
        System.out.println(value(arr,target));
    }
    public static boolean value(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
            
        }
        return false;
    }
}

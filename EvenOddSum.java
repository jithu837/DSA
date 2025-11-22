public class EvenOddSum {
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,4,3,6,2};
        int sumEven = 0;
        int sumOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumEven=sumEven+arr[i];
            }
            else{
                sumOdd+=arr[i];
            }
            
        }System.out.println(sumEven);
            System.out.println(sumOdd);
       
    }
}

public class prime{
    public static void main(String[] args) {
        int sln=1;
        for(int j=1;j<=50;j++){
        int num=j;
        int count=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(sln+")"+num);
            sln++;
        }
       
    }
}}
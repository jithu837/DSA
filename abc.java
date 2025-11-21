public class abc
{
    public static void main(String[] args) {
       int num=456789;
       int sum=0;
       int mul=1;
       int count=0;
       int rev=0;
       while(num!=0){
        int ld=num%10;
        sum = sum + ld;
        mul = mul*10;
        count++;
        rev=rev*10+ld;
        num = num / 10;
       }
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(count);
        System.out.println(rev);
              
    }
}
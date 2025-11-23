import java.util.*;
public class SumRecursion{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++)
            {
                sum+=i;
            } 
            System.out.println(sum);
    }
}
//1+2+3+4+5=15
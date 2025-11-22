import java.util.*;
public class fibonacciseries
{
    public static void main(String[] args) {
        int n =0;
        int m=1;
        int temp=0;
        
        for(int i=1;i<=30;i++)
        {
            n=m;
            m=temp;
            temp=n+m;
            System.out.println(temp);
        }   
        

    }
}


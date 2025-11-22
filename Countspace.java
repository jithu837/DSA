//count and remove the spaces for given word
import java.util.*;
public class Countspace {
    public static void main(String[] args) {
        String str="i love india. ";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("The number of spaces are :"+count);
        String newstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                newstr+=str.charAt(i);
            }
        }
        System.out.println("The new string is :"+newstr);
    }
}

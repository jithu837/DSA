//write a program to find largest word in a given string
import java.util.*;
public class LargestWord {
    public static void main(String[] args) {
        String str="i love india";
        String[] words=str.split(" ");
        int max=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>max){
                max=words[i].length();
            }
        }
        System.out.println("The largest word is :"+max);
    }
}

//write a program count of the words in given array
public class Countstring {
    public static void main(String[] args) {
        String str="welcome to my java class";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("The number of words are :"+count);

    }
}

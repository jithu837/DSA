//write a program to find the even index of a character in a given string

class EvenIndexChar {
    public static void main(String[] args) {
        String str="python";
        int i=0;
        while(i<str.length()){
            if(i%2==0){
                System.out.println(i+" "+str.charAt(i));
            }
            i++;
        }
    }
}

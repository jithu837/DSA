public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(prints(10));
    }
    public static int prints(int num){
        if(num==0) {
            System.out.println("Start!");
            return 0;
        }
        System.out.println(num);
        return prints(num - 1);
    }
}

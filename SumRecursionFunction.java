public class SumRecursionFunction {
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    public static int add(int num){
        if(num==0){
            return 0;
        }else{
            return num+ add(num-1);
        }
    }
}
//5+add(5-1)
//5 + 4 + add(4-1)......

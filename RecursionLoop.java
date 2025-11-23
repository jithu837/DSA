public class RecursionLoop {
    public static void loop() {
        System.out.println("This will run forever");
        loop();
    }
    public static void main(String[] args) {
        loop();
    }
}

package Java.practice;

public class Practice {
    public static void main(String[] args) {
        String x = "water";
        String y = "coke";
        String ph = x;
        x = y;
        y = ph;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}

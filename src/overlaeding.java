public class overlaeding {
    static int calcu(int a, int b) {
        return a + b;
    }

    static double calcu(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("addition " + overlaeding.calcu(5.7, 5.0));
        System.out.println("subtraction " + overlaeding.calcu(5,5));
    }
}

public class RecursionFibo {
    public int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args) {
        RecursionFibo recursionFibo = new RecursionFibo();
        System.out.println(recursionFibo.factorial(5));
    }

}

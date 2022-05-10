public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(4));
    }
    public static int fibonacciSeries(int n){
        if( n < 0 ){
            return -1;
        }
        if ( n == 0 || n == 1){
            return n;
        }
        return fibonacciSeries(n -1) + fibonacciSeries(n -2);
    }
}

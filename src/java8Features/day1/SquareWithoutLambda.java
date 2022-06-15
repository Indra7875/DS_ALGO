package java8Features.day1;

public class SquareWithoutLambda {
    public static void main(String[] args) {
        System.out.println("The square of 4 is : "+square(4));
        System.out.println("The square of 8 is : "+square(8));
    }

    public static int square(int n){
        return n * n;
    }
}

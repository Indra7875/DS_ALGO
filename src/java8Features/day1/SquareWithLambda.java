package java8Features.day1;

import java.util.function.Function;

public class SquareWithLambda {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i -> i * i;
        System.out.println("The square of 4 : "+f.apply(4));
        System.out.println("The square of 8 : "+ f.apply(8) );
    }
}

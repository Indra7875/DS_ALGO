package java8Features.day1;

import java.util.function.Predicate;

public class EvenOddPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(30));
        System.out.println(p.test(3));
    }
}

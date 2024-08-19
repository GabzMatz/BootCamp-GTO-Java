package StreamApi;

import java.util.function.Predicate;

public class OptionalExample {

    public static void main(String[] args) {

        Predicate<Integer> test= x -> x > 0;
        System.out.println(test.test(1));
    }

}

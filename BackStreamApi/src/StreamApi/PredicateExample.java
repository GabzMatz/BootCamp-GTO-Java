package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {


        List<String> palavras = Arrays.asList("ga","amandawdw","feliza","bruna");

        Predicate<String> maxCincoCacaracters= p -> p.length() <= 5;

        palavras.stream().filter(maxCincoCacaracters).forEach(System.out::println);




    }
}

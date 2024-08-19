package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function2 {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = n -> n * 2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());

        numerosDobrados.forEach(n-> System.out.println(n));

    }


}

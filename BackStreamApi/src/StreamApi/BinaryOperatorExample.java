package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1,1,1,1);


        //Pode declarar desta forma tbm
        // BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;



        int result = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);


        System.out.println(result);



    }
}

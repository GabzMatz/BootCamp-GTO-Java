package StreamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suplaier {
    public static void main(String[] args) {

        Supplier<String> saudacao = ()-> "Ola, seja bem vindo";

        //Consigo gerar o texto
        List<String> listaSaudacao = Stream.generate(saudacao).limit(5).toList();

        listaSaudacao.forEach(s->System.out.println(s));

    }
}

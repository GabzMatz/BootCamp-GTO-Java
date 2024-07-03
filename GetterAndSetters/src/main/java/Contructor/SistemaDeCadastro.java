package Contructor;

import Contructor.pessoas.Pessoa;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa Gabriel = new Pessoa("Gabriel",
                52720963801L,
                "Rua Maestro Porfirio Tavares");

        System.out.println("Nome: " + Gabriel.getNome());
        System.out.println("CPF: " + Gabriel.getCpf());
        System.out.println("Endereço: " + Gabriel.getEndereco());


    }
}

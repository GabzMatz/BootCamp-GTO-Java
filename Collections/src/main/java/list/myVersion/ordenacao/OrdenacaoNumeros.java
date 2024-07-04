package list.myVersion.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public void ordenarAscendente(){
        Collections.sort(numeros);
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(99);
        ordenacaoNumeros.adicionarNumero(72);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        System.out.println(ordenacaoNumeros);
        System.out.println("======");
        ordenacaoNumeros.ordenarAscendente();
        System.out.println(ordenacaoNumeros);

    }
}


package list.myVersion.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> numeros;


    public SomaDeNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(int n : numeros){
                soma+= n;
            }
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if(!numeros.isEmpty()){
            for(int n : numeros){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if(!numeros.isEmpty()){
            int firstItem = numeros.getFirst();
            for(int n : numeros){
                if(n < firstItem){
                    firstItem = n;
                }
            }
            menorNumero = firstItem;
        }
        return menorNumero;
    }
    public List<Integer> exibirNumeros(){
        if(!numeros.isEmpty()){
            for(int n : numeros){
                System.out.println(n);
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumero(1);
        somaDeNumeros.adicionarNumero(2);
        somaDeNumeros.adicionarNumero(3);
        System.out.println(somaDeNumeros.calcularSoma());
        System.out.println(somaDeNumeros.encontrarMenorNumero());
        System.out.println(somaDeNumeros.encontrarMaiorNumero());
        somaDeNumeros.exibirNumeros();
    }


}

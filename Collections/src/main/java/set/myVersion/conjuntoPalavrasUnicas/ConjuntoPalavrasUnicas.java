package set.myVersion.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }
    public void removerPalavra(String palavra){
        for(String p : palavras){
            if(palavra.equals(p)){
                palavras.remove(palavra);
                break;
            }
        }
    }
    public void verificarPalavra(String palavra){
        for(String p : palavras){
            if(palavra.equals(p)){
                System.out.println("Existe sua palavra");
            } else {
                System.out.println("Nao existe!");
            }
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Banana");
        conjuntoPalavrasUnicas.adicionarPalavra("Arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("Maça");
        conjuntoPalavrasUnicas.adicionarPalavra("Maça");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Banana");
        conjuntoPalavrasUnicas.removerPalavra("Arroz");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}

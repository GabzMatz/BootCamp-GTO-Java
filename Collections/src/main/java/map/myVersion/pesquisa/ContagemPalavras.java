package map.myVersion.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;


    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;

        int cont = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > cont) {
                cont = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras cont = new ContagemPalavras();


        cont.adicionarPalavra("Gabriel", 89345);
        cont.adicionarPalavra("Ana", 89515);
        System.out.println(cont.encontrarPalavraMaisFrequente());
    }
}

package map.myVersion.operacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapDicionario;


    public Dicionario() {
        this.mapDicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        mapDicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!mapDicionario.isEmpty()){
            mapDicionario.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(mapDicionario);
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraSearch = "";
        if (!mapDicionario.isEmpty() && mapDicionario.containsKey(palavra)) {
            palavraSearch = mapDicionario.get(palavra);
        }
            return palavraSearch;
    }


    public static void main(String[] args) {

        Dicionario dic = new Dicionario();

        dic.adicionarPalavra("Arroz","Feito pra comer");
        dic.adicionarPalavra("Banana","pra comer tbm");


        dic.exibirPalavras();
        System.out.println(dic.pesquisarPorPalavra("Banana"));

    }
}

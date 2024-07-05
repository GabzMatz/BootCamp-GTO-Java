package map.myVersion.ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livroMap.put(link, new Livro(titulo, autor, preco));
    }
    public void removerLivro(String titulo){
        for (Map.Entry<String, Livro> entry: livroMap.entrySet()){
            if (entry.getValue().getTitulo().equals(titulo)){
                livroMap.remove(entry.getKey());
                break;
            }
        }
    }
    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> ordemPrecoTree = new TreeMap<>(livroMap);
        for (Map.Entry<String, Livro> entry: ordemPrecoTree.entrySet()){
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return ""+livroMap;
    }

    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();

        livros.adicionarLivro("457g4n8395v34n´59v345", "Senhor","Feliz",32.50);
        livros.adicionarLivro("5235v2532b5´59v345", "wagawg","Feliz",39.20);
        livros.adicionarLivro("b235b23  5b23´59v345", "rjj45j","Feliz",12.10);
        System.out.println(livros);
        livros.removerLivro("Senhor");
        System.out.println(livros);
        System.out.println("=======");
        livros.exibirLivrosOrdenadosPorPreco();
    }



}

package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private  List<Livro> livroList;


    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroIntervalo.add(l);
                }
            }
        }
        return livroIntervalo;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisado = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisado = l;
                    break;
                }
            }
        }
        return livroPesquisado;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor1",2024);
        catalogoLivros.adicionarLivro("Livro 2", "Autor2",2010);
        catalogoLivros.adicionarLivro("Livro 3", "Autor2",2011);
        catalogoLivros.adicionarLivro("Livro 4", "Autor3",2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2025));

    }
}

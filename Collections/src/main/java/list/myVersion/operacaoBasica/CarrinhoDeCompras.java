package list.myVersion.operacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;


    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item produto = new Item(nome, preco,quantidade);
        carrinhoCompras.add(produto);

    }
    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for (Item i : carrinhoCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(i);
            }
        }
        carrinhoCompras.removeAll(itensRemovidos);
    }
    public double calcularValorTotal(){

        double fullValue = 0;
        for (Item i : carrinhoCompras){

            fullValue += i.getQuantidade() * i.getPreco();
        }
        return fullValue;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 10.00, 3);
        carrinhoDeCompras.adicionarItem("Feijao", 12.00, 2);

        carrinhoDeCompras.removerItem("Feijao");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }

}

package introduction;

public class Carro extends Veiculo {


    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Compustivel");
    }
    private void confereCambio(){
        System.out.println("Confere Cambio");

    }
}

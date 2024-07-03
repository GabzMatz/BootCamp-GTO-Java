package Enums;

public class SistemaIBGE {

    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo()+ " - " + e.getIbge());
        }

        EstadoBrasileiro piaui =  EstadoBrasileiro.PIAUI;

        System.out.println("---");
        System.out.println(piaui.getSigla());
    }
}

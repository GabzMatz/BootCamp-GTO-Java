package org.iphone.apps.telefone;

public class TelefoneOpcao implements Telefone{


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Voce atendeu um numero");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Niguem atendeu");
    }
}

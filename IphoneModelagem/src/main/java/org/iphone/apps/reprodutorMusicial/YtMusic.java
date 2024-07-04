package org.iphone.apps.reprodutorMusicial;

public class YtMusic implements SondsApps {

    @Override
    public void tocar() {
        System.out.println("Voce esta escutando musica no Itunes");
    }

    @Override
    public void pausar() {
        System.err.println("Voce pausou");

    }

    @Override
    public void selecao(String musica) {

        System.out.println("Voce selecou : " + musica);
    }
}

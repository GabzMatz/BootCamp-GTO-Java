package ens.gabriel.metodos;

public class SmarTvCorrection {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("-------ligado---------");
    }
    public void desligar(){
        ligada = false;
        System.out.println("-------------desligado----------------");
    }
    public void aumentarVolume(){
        System.out.println("-------------aumentando----------------");
        volume++;
    }
    public void diminuirrVolume(){
        System.out.println("-------------diminuindo----------------");
        volume--;
    }
}
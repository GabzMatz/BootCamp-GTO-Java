package ens.gabriel.metodos;

public class Pessoa {
    public static void main(String[] args) {

        SmarTvCorrection smartTv = new SmarTvCorrection();


        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirrVolume();
        smartTv.ligar();
        System.out.println("-------------------");
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);


    }
}

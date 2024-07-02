package ens.gabriel.anatomiaDeClasses;

public class metodos {

    public static void main(String[] args) {


        System.out.println(soma(3,3));

        System.out.println(nomeComepleto("Gabriel","Matos"));
    }


    public static String nomeComepleto(String priemiroNome, String segundoNome) {
        return priemiroNome +" "+ segundoNome;


    }

    public static int soma(int a, int b) {

        return  a + b;
    }

}

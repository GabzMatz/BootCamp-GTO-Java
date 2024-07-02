package ens.gabriel.tests;

import java.util.Arrays;

public class test1 {


    public static void main(String[] args) {


        int[] pessoas2= {1,2,3,4,5,6};

        int[] pessoas = new int[6];

        int cont = 0;

        for(int i = 1; i < pessoas.length + 1; i++){
            pessoas[cont] = i;
            cont++;

        }
        System.out.println(Arrays.toString(pessoas));
        System.out.println(Arrays.toString(pessoas2));

    }



}

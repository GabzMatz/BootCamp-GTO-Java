package org.iphone.apps.navegador;

import java.util.ArrayList;

public class Safari {

    private String URL = "Google.com";
    private ArrayList<String> sites = new ArrayList<>();

    public void exibirPagina(String url){
        this.URL = url;
    }

    public void getPage(){
        System.out.println(URL);
    }


}

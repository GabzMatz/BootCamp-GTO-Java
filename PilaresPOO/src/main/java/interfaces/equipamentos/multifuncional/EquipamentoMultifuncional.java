package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora , Impressora {

    public void copiar(){
        System.out.println("Copiano via equipamento multi");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via multi");
    }
    public void imprimindo(){
        System.out.println("Imprimindo via multi");
    }

}

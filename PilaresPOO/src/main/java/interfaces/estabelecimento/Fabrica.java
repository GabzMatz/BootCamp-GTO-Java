package interfaces.estabelecimento;

import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional impressora = new EquipamentoMultifuncional();
        Impressora impressoraDesk = new Deskjet();
        


        impressora.imprimindo();
        impressoraDesk.imprimindo();
    }
}

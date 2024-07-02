package ens.gabriel.metodos;

public class SmartTV {

    public boolean ligada;
    public int canal;
    public int volume;

    public void setLigar(boolean ligada){
        this.ligada=ligada;


        if(!ligada){
            this.ligada = false;
            System.out.println("Desligada");
        }

    }
    public void alterarVolume(int volume){
        if(volume == 1 || volume == -1){
            this.volume = volume;
            this.volume++;
        }else{
            System.out.println("So aumenta de um e um");
        }
    }
    public void auemntaCanal(int canal) {
        if (canal == 1 || canal == -1) {
            this.canal = canal;
        } else {
            System.out.println("So aumenta de um e um");
        }
    }
    @Override
    public String toString() {
        return "SmartTV{" +
                "ligada=" + ligada +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.setLigar(true);
        smartTV.alterarVolume(1);
        smartTV.auemntaCanal(-1);
        System.out.println(smartTV.toString());

    }


}

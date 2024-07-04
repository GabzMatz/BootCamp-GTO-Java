package set.operacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarPessoa(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome , codigoConvidado));
    }
    public void removerConvidado(int codigoConvite){
        Convidado convidado = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidado = c;
                break;
            }
        }
        convidadoSet.remove(convidado);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {

    }
}

package set.myVersion.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao,false));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemovida = t;
                break;
            }
        }
        tarefasSet.remove(tarefaRemovida);
    }
    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }
    public void contarTarefas(){
        System.out.println(tarefasSet.size());
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefasSet){
            if(t.isCheck()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefasSet){
            if(!t.isCheck()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setCheck(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setCheck(false);
                break;
            }
        }
    }
    public void limparListaTarefas(){
        tarefasSet.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Treinar");
        listaTarefas.marcarTarefaConcluida("Estudar");
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.removerTarefa("Treinar");

        listaTarefas.exibirTarefas();

    }
}

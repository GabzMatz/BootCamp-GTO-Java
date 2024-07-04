package set.myVersion.listaDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean check;

    //Contructor
    public Tarefa(String descricao, boolean check) {
        this.descricao = descricao;
        this.check = check;
    }


    //Getter and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", check=" + check +
                '}';
    }
}

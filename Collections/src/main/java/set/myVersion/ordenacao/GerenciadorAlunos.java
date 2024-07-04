package set.myVersion.ordenacao;

import set.ordenacao.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        setAlunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        for(Aluno a : setAlunos){
            if(a.getMatricula().equals(matricula)){
                setAlunos.remove(a);
                break;
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosNome = new TreeSet<>(setAlunos);
        return alunosNome;
    }
    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunosMedia = new TreeSet<>(new CompareAlunosNotas());
        alunosMedia.addAll(setAlunos);
        return alunosMedia;
    }

    @Override
    public String toString() {
        return "" + setAlunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos sala = new GerenciadorAlunos();

        sala.adicionarAluno("Joao", 38947232323L,2);
        sala.adicionarAluno("Ana", 389464869413L,6.5);
        sala.adicionarAluno("Felipe", 386543197453L,9);


        System.out.println(sala);
        System.out.println(sala.exibirAlunosPorNome());
        System.out.println(sala.exibirAlunosPorMedia());
    }
}

package GetterAndSetters.escola;

public class Escola {
    public static void main(String[] args) {
//        felipe.nome="Felipe";
//        felipe.idade = 8;
//
//        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");

        Aluno aluno01 = new Aluno();

        aluno01.setNome("Felipe");
        aluno01.setIdade(21);

        System.out.println(aluno01.getNome()+"   "+aluno01.getIdade());

        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}

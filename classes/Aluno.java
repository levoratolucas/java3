package classes;

public class Aluno extends Pessoa {
      private Pessoa aluno;
      private String matricula;

      public Aluno(Pessoa pessoa) {
            this.aluno = pessoa;
      }
      public String getNome(){
            return aluno.getnome();
      }

}

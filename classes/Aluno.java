package classes;

public class Aluno {
    public String nome = new String();
    public String matricula;
    public int idade;
    public Aluno() {
              
    }
    public Aluno(String n) {
          this.nome = n;     
    }
    public Aluno(String n,int i) {
          this.nome = n;     
          this.idade =i;
    }
}

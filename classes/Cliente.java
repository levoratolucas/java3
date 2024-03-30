package classes;

public class Cliente {
    private int grupo;
    private Pessoa pessoa = new Pessoa();

    public Cliente(Pessoa pes) {
        this.pessoa = pes;
    }

    public Pessoa GetPessoa() {
        return pessoa;
    }
    public int GetGrupo() {
        return grupo;
    }
    public void setGrupo(int g){
        this.grupo=g;
    }
}

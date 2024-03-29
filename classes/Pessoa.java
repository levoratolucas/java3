package classes;

public class Pessoa {
    private String nome,cpf;
    private int idade=0;
    public Pessoa(String n){
        nome = n;
        
    }
    public Pessoa(String n,String c){
        nome = n;
        cpf = c;
    }
    public void setNome(String n){
        if(nome != null){
            this.nome = n;
        }
    }
    public void setIdade(int i){
        if(idade == 0){
            this.idade = i;
        }
    }
    public void setCpf(String c){
        if(cpf != null){
            this.cpf=c;
        }
    }
    public String getnome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
}

// ./Nadador.java 
package classes;

public class Nadador {

    private Pessoa pessoa = new Pessoa();
    private int categoria;

    public Nadador(Pessoa pes) {
        this.pessoa = pes;
    }

    public Pessoa GetPessoa() {
        return pessoa;
    }
    // Infantil A = 5 - 7 anos
    // Infantil B = 8 - 10 anos
    // juvenil A = 11- 13 anos
    // juvenil B = 14 - 17 anos
    // Sênior = 18 - 25 anos
    public String getCategoria() {
        int idade = pessoa.getIdade();
        if (idade > 4 && idade < 8) {
            return "Infantil A";
        } else if (idade > 7 && idade < 11) {
            return "Infantil B";
        } else if (idade > 10 && idade < 14) {
            return "juvenil A";
        } else if (idade > 13 && idade < 18) {
            return "juvenil B";
        } else if (idade > 17 && idade < 26) {
            return "Sênior";
        } else {
            return "idade fora da faixa etária";
        }
    }

}

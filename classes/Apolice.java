// ./Apolice.java 

package classes;

import java.util.ArrayList;
import java.util.List;

public class Apolice {
    private int categoria;
    private List<Cliente> clientes;

    public Apolice(Cliente cli) {
        this.clientes = new ArrayList<>();
        this.clientes.add(cli);
    }

    public Cliente getCliente(int i) {
        return clientes.get(i);
    }
    // Idade Baixo Médio Alto
    // 17 a 20 1 2 3
    // 21 a 24 2 3 4
    // 25 a 34 3 4 5
    // 35 a 64 4 5 6
    // 65 a 70 7 8 9

    public int CalcularCategoria(int i) {
        int idade = clientes.get(i).GetPessoa().getIdade();
        int grupo = clientes.get(i).GetGrupo();
        if (idade < 18 && idade > 70) {
             categoria = 0;
        }
        else if(idade > 17 && idade < 21){
             categoria =grupo;
        }
        else if(idade > 20 && idade < 25){
             categoria =grupo+1;
        }
        else if(idade > 24 && idade < 35){
             categoria =grupo+2;
        }
        else if(idade > 34 && idade < 65){
             categoria =grupo+3;
        }
        else{
             categoria =grupo+6;
        }

        return categoria;
    }
}

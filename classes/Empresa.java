package classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;
    private String nome;

    public Empresa() {
        this.funcionarios = new ArrayList<>();

    }

    public void setFuncionario(Funcionario func) {
        this.funcionarios.add(func);
    }
    public Funcionario getFuncionario(int i){
        return funcionarios.get(i);
    }
    public int countFuncionarios(){
        return funcionarios.size();
    }
}

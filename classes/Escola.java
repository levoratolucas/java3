package classes;
import java.util.ArrayList;
import java.util.List;
public class Escola {
    private String nome;
    private int valorHora=0;
    private List<Funcionario> professores;

    public Escola(Funcionario prof){
        this.professores=new ArrayList<>();
        this.professores.add(prof);
    }
    public void setProfessor(Funcionario Prof){
        this.professores.add(Prof);
    }
    public Funcionario getProfessor(int i){
        return professores.get(i);
    }
    public int calcularSalario(int nivel){
        
        switch (nivel) {
            case 1:
            valorHora = 12;
                break;
            case 2:
            valorHora = 17;
                break;
            case 3:
            valorHora = 25;
                break;        
            default:
            Tools.println("Nivel invalido, volte depois que souber o nivel.");
                break;

            }
            return valorHora;
    }
}

// ./Exe16.java 
// 16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários 
// de acordo com os seguintes critérios: 
// a) 50% para aqueles que ganham menos do que três salários mínimos; 
// b) 20% para aqueles que ganham entre três até dez salários mínimos; 
// c) 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
// d) 10% para os demais funcionários.

package classes;

public class Exe16 {
    public static Empresa empresa(int cont){
        
        Pessoa[] pessoas = new Pessoa[cont];
        Funcionario funcionario;
        Empresa empresa = new Empresa();
        
        for (int i = 0; i < cont; i++) {
            pessoas[i] = new Pessoa();
            funcionario = new Funcionario(pessoas[i]);
            funcionario.setSalario((4+i)/3);
            empresa.setFuncionario(funcionario);      
        }
        return empresa;
    }
    public static void executar() {
        
        int cont = 584;
        double salario;
        Empresa empresa = empresa(cont);       
        for(int i=0;i<cont;i++){
            salario = empresa.getFuncionario(i).GetSalario();
            if(salario < 3){
               salario*=1.5;
            }
            else if(salario <= 10){
               salario*=1.2;
            }
            else if(salario <= 20){
               salario*=1.15;
            }
            else{
               salario*=1.1;
            }
            empresa.getFuncionario(i).setSalario(salario);
            Tools.printFormat("salario ajustado %.2f\n",empresa.getFuncionario(i).GetSalario());
        }

        
    }

}

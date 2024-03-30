// ./Exe17.java 
// 17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
// reajustado.  Escrever  o  nome  do  funcionário,  o  reajuste  e  seu  novo  salário.  Calcule  quanto  à 
// empresa vai aumentar sua folha de pagamento.

package classes;

public class Exe17 {
    public static void executar(){
        Exe16 exe16 = new Exe16();
        Empresa empresa = exe16.empresa(584);

        Tools.println("Qual o salario minimo?");

        double salarioMinimo = Tools.scanfdouble();
        
        for ( int i = 0;i<empresa.countFuncionarios();i++) {

            Tools.printFormat("qual o nome do %d° Funcionario?",i+1);

            empresa.getFuncionario(i).GetPessoa().setNome(Tools.scanfStr());

            String nome =    empresa.getFuncionario(i).GetPessoa().getnome();

            double salario =empresa.getFuncionario(i).GetSalario() ;

            Tools.printFormat("%s seu salario é de %.2f\n",nome ,salario*salarioMinimo);            
        }                
    }    
}

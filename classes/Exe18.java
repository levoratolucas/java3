// ./Exe18.java18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre 
// o nome e o salário líquido acrescido do abono conforme o sexo e a idade: 
// Sexo Idade Abono 
// M    >= 30 100,00 
//       < 30  50,00 
// F    >= 30 200,00 
//       < 30  80,00

package classes;

public class Exe18 {
    public static void executar() {
        double salario,abono=0;
        Pessoa pessoa;
        Funcionario funcionario;
        Empresa empresa = new Empresa();
        Tools.println("Qual o seu nome?");
        pessoa = new Pessoa(Tools.scanfStr());
        Tools.println("Quantos anos você tem?");
        pessoa.setIdade(Tools.scanfInt());
        Tools.println("Sexo masculino ou feminino? F/M");
        pessoa.setSexo(Tools.scanfStr());
        funcionario = new Funcionario(pessoa);
        Tools.println("Qual seu salario?");
        funcionario.setSalario(Tools.scanfdouble());
        empresa.setFuncionario(funcionario);
        salario = empresa.getFuncionario(0).GetSalario();
        if (funcionario.GetPessoa().getIdade() >= 30 && funcionario.GetPessoa().getSexo().toUpperCase().equals("M")) {
            abono=  100;
        }
        else if (funcionario.GetPessoa().getIdade() < 30 && funcionario.GetPessoa().getSexo().toUpperCase().equals("M")) {
            abono=  50;
        }
        if (funcionario.GetPessoa().getIdade() >= 30 && funcionario.GetPessoa().getSexo().toUpperCase().equals("F")) {
            abono=  200;
        }
        if (funcionario.GetPessoa().getIdade() < 30 && funcionario.GetPessoa().getSexo().toUpperCase().equals("F")) {
            abono=  80;
        }
        Tools.printFormat("Seu bono salarial é %.2f e seu salario será %.2f",abono,salario+abono);
    }

}

// ./Exe20.java
// 20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa 
// que calcule e exiba o salário  de um professor. Sabe-se que o  valor da hora/aula segue a tabela 
// abaixo: 
// Professor Nível 1 R$12,00 por hora/aula 
// Professor Nível 2 R$17,00 por hora/aula 
// Professor Nível 3 R$25,00 por hora/aula
package classes;

public class Exe20 {
    public static void executar(){
        
        Tools.println("Qual o nome do professor?");
        Pessoa pessoa = new Pessoa(Tools.scanfStr());

        Funcionario funcionario = new Funcionario(pessoa);

        Tools.println("Qual o Nivel do professor? 1--2--3");

        Escola escola = new Escola(funcionario);

        int salario = escola.calcularSalario(Tools.scanfInt());

        funcionario.setSalario(salario);

        Tools.printFormat("O salario do professor é %.2f por hora.",escola.getProfessor(0).GetSalario());
        
    }
}

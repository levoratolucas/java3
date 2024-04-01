// ./exe22.java
// 22. Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo 
// da conta de luz segue a tabela abaixo: 
// Tipo de Cliente Valor do KW/h 
// 1 (Residência) 0,60 
// 2 (Comércio) 0,48 
// 3 (Indústria) 1,29

package classes;


public class Exe22 {
    public static void executar(){
        Copel copel = new Copel();
        Pessoa pessoa;
        int tipo;
        String conta;
        Tools.println("Qual o seu nome?");
        pessoa = new Pessoa(Tools.scanfStr());
        copel.setCliente(pessoa);
        Tools.println("Qual seu tipo de imovel?");
        Tools.println("1 (Residência)\n2 (Comércio)\n3 (Indústria)");
        tipo = Tools.scanfInt();
        Tools.println("Quantos KW consumiu?");
        conta = copel.getConta(tipo, Tools.scanfInt());
        Tools.println(conta);

    }
}

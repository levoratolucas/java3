// ./Exe26.java 
// 26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. 
// Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de 
// seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto. 
// A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, 
// idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso a 
// idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra 
// em nenhuma das categorias ofertadas

// Idade   Baixo   Médio   Alto 
// 17 a 20   1     2       3 
// 21 a 24   2     3       4 
// 25 a 34   3     4       5 
// 35 a 64   4     5       6 
// 65 a 70   7     8       9 
 


package classes;

public class Exe26 {
    public static void executar(){
        Tools.println("qual o seu nome?");
        Pessoa pesssoa = new Pessoa(Tools.scanfStr());
        Tools.printFormat("%s, Qual sua idade?\n", pesssoa.getnome());
        pesssoa.setIdade(Tools.scanfInt());
        Cliente cliente = new Cliente(pesssoa);
        Tools.printFormat("%s, qual seu grupo de risco? Baixo--1 Medio 2 Alto 3\n",pesssoa.getnome());
        cliente.setGrupo(Tools.scanfInt());

        Apolice apolice = new Apolice(cliente);
        Tools.printFormat("A categoria do seu contrato é %d ", apolice.CalcularCategoria(0));
    }
    
}

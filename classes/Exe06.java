// Exe06.java
// 6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-
// se  que  o  preço  de  custo  receberá  um  acréscimo  de  acordo  com  um  percentual  informado  pelo 
// usuário.
package classes;

public class Exe06 {
    public static void executar(){
        Tools.println("Qual o valor do produto?");
        float valor = Tools.scanffloat();
        Tools.println("Qual percenual pretende acrescentar?");
        float acrescimo = Tools.scanffloat();
        Produto produto = new Produto(valor, acrescimo);
        Tools.printFormat("O produto deverá custar %.2f ao cliente final", produto.calcular());
    }
    
}

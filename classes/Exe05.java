// Exe05.java 
// 5.  A  Loja  Mamão  com  Açúcar  está  vendendo  seus  produtos  em  5  (cinco)  prestações  sem  juros. 
// Faça um programa que receba um valor de uma compra e mostre o valor das prestações.

package classes;

public class Exe05 {
    public static void executar(){
        Tools.println("Qual valor da sua compra");
        float valorCompra=Tools.scanffloat();
        Loja loja = new Loja(valorCompra);
        Tools.println(loja.calcular());
    }
    
}

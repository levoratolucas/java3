// Exe04.java
// 4.  Elaborar  um  programa  que  efetue  a  apresentação  do  valor  da  conversão  em  real  (R$)  de  um 
// valor  lido  em  dólar  (US$).  O  programa  deverá  solicitar  o  valor  da  cotação  do  dólar  e  também  a 
// quantidade de dólares disponíveis com o usuário.

package classes;

public class Exe04{
    public static void executar(){
        Tools.println("Quantos dolares pretende trocar?");
        float dolar=Tools.scanffloat();
        Tools.println("Qual a cotação do dia?");
        float cotação=Tools.scanffloat();
        Cambio cambio = new Cambio(dolar,cotação);
        Tools.printFormat("Você terá %.2f R$ ",cambio.calcular());
    }    
}
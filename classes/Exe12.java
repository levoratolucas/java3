// ./Exe12.java
// 12.  A  concessionária  de  veículos  “CARANGO  VELHO”  está  vendendo  os  seus  veículos  com 
// desconto.  Faça  um  programa  que  calcule  e  exiba  o  valor  do  desconto  e  o valor  a  ser  pago  pelo 
// cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 
// - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto 
// até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral.
package classes;

public class Exe12 {
    public static void executar() {
        Tools.println("BEM VINDO AO CARANGO VELHO");
        Tools.println("QUE TAL DAR UMA OLHADINHA NOS NOSSOS CARROS?");
        int num =20;
        Carr[] carrs = new Carr[num];
        Tools.println("HOJE NÓS TEMOS " + carrs.length + " CARROS NA GARAGEM");

        double valor = 15000;
        for (int i = 0; i < carrs.length; i++) {
            valor = valor + (i * 1000);
            carrs[i] = new Carr();
            carrs[i].setValor(valor);
            carrs[i].setAno(1995 + i);
        }
        int i=0;
        String fim;
        do {           
            valor = carrs[i].getValor() * .88;
                if (carrs[i].getAno() < 2000) {
                    valor = carrs[i].getValor() * .93;
                }
                Tools.println("este esta custando " + valor+"\nDeseja continuar? S/N");

                fim = Tools.scanfStr().toUpperCase();
            i++;
            if(i>num){
                i=0;
            }
        } while (!fim.equals("N"));
        i=0;
        for (Carr carr : carrs) {
            if(carr.getAno()<2001){
                i++;
            }
        }
        Tools.printFormat("No total são %d carros sendo %d abaixo do ano de 2000",carrs.length,i);
    }
}

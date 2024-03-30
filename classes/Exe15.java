// ./Exe15.java15. 
// A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça 
// um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto 
// deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina 
// –  21%  ou  diesel  –14%).  Com  valor  do  veículo  zero  encerra  entrada  de  dados.  Informe  total  de 
// desconto e total pago pelos clientes.
package classes;

public class Exe15 {
    public static void executar() {
        Tools.println("BEM VINDO AO CARANGO ");
        Tools.println("QUE TAL DAR UMA OLHADINHA NOS NOSSOS CARROS?");
        double desconto = 0, valor = 0;
        Carr carr = new Carr();
        do {
            Tools.println("Qual o valor do carro?");
            carr = new Carr(Tools.scanffloat());
            if (carr.getValor() == 0) {
                break;
            }
            Tools.println("Gasolina 1 Alcool 2 Diesel 3 ?");
            carr.setCombustivel(Tools.scanfInt());
            switch (carr.getCombustivel()) {
                case 1:
                    valor = (carr.getValor() * 0.79);
                    desconto = carr.getValor() - (carr.getValor() * 0.79);
                    break;
                case 2:
                    valor = (carr.getValor() * 0.75);
                    desconto = carr.getValor() - (carr.getValor() * 0.75);
                    break;
                case 3:
                    valor = (carr.getValor() * 0.86);
                    desconto = carr.getValor() - (carr.getValor() * 0.86);
                    break;

                default:
                    break;
            }
            Tools.printFormat("\nO valor do desconto é de %.2f e o valor do carro ficou %.2f\n", desconto, valor);
        } while (carr.getValor() != 0);
    }

}

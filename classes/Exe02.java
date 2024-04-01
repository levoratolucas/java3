// ./Exe02.java
// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a 
// distância total percorrida pelo automóvel e o total de combustível gasto.
package classes;

public class Exe02 {
    public static void executar(){
        Carr carro = new Carr();
        Tools.println("Quantos KM você percorreu?");
        int km = Tools.scanfInt();
        Tools.println("Quantos litros gastou??");
        double media = km/Tools.scanfdouble();
        Tools.printFormat("Seu carro esta fazendo %.2f km/L", media);


    }
    
}

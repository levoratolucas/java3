package classes;
// Exe07.java
// 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
// distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a 
// percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja 
// de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe 
// o custo ao consumidor do mesmo.

public class Exe07 {
    public static void executar(){
        
        Tools.println("qual o valor de custo do carro?");
        float valor = Tools.scanffloat();
        Carr carr = new Carr(valor);
        Tools.printFormat("O valor do final do carro é %.2f",carr.calcular());
    }
}

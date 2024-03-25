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
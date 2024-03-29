// ./Exe10.java 
// 10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem 
// informando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18 
// anos como maior de idade.
package classes;

public class Exe10 {
    public static void executar(){
        String msg ="maior de idade";
        int cont;
        Tools.println("Quantas pessoas vamos verificar?");
        cont = Tools.scanfInt();
        Pessoa[] pessoa= new Pessoa[cont];

        for(int i=0;i<pessoa.length;i++){
            Tools.printFormat("Qual a idade da %d° pessoa?", i+1);
            pessoa[i]= new Pessoa(Tools.scanfInt());          
        }
        for(int i=0;i<pessoa.length;i++){
            if(pessoa[i].getIdade()<18){
                msg = "menor de idade";
            }          
            Tools.printFormat("\nA %d° é "+msg,i+1);
        }


    }
    
}

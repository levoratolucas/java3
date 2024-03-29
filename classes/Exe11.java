// ./Exe.java 
// 11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é 
// homem ou mulher. No final informe total de homens e de mulheres.
package classes;
public class Exe11 {
    public static void executar(){
        Pessoa[] pessoas = new Pessoa[56];
        String sexo;
        for(int i=0;i<pessoas.length;i++){
            Tools.printFormat("Qual o nome da %d° pessoa?\n",i+1);
            pessoas[i]=new Pessoa(Tools.scanfStr());
            Tools.printFormat("Qual o sexo da %d° pessoa? S-F \n",i+1);
            do {
                System.out.print("Digite o sexo (M/F): ");
                sexo = Tools.scanfStr().toUpperCase();
                if (!sexo.equals("F") && !sexo.equals("M")) {
                    Tools.println("Sexo inválido. Digite novamente.");
                }
            } while (!sexo.equals("F") && !sexo.equals("M"));
            pessoas[i].setSexo(sexo);
        }
        int j =0;
        for(int i =0; i<pessoas.length;i++){
            if(pessoas[i].getSexo().equals("F") ){
                j++;
            }
        }
        Tools.printFormat("No total são %d mulheres e %d homens", j,pessoas.length-j);
    }
}

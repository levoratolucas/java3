// ./Exe13.java
// 13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe 
// se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.
package classes;

public class Exe13 {
    public static void executar(){
        
        Tools.println("Quantas pessoas vamos identificar");

        String msg ="apto";
        Pessoa[] pessoas = new Pessoa[Tools.scanfInt()];


        for (int i =0;i<pessoas.length;i++) {
            Tools.printFormat("Qual o nome da %d° pessoa?\n",i+1);
            pessoas[i]=new Pessoa(Tools.scanfStr());
            Tools.println("qual o sexo?");
            pessoas[i].setSexo(Tools.scanfStr());
            Tools.println("Qual idade?");
            pessoas[i].setIdade(Tools.scanfInt());
            Tools.println("Esta saudável ? S?N");
            pessoas[i].setSaude(true);
            if(Tools.scanfStr().toUpperCase().equals("N")){
            pessoas[i].setSaude(false);}
        }
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getSexo().toUpperCase().equals("F") || pessoa.getSaude()==false || pessoa.getIdade() <18) {msg="inapto";}
            Tools.println("O "+pessoa.getnome()+" esta "+msg);            
        }   
            
            
       

    }
    
}

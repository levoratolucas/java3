// ./Exe01.java
// 1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve 
// no semestre. No final informar o nome do aluno e a sua média (aritmética).
package classes;

public class Exe01 {
    public static void executar() {
        int num = 3;
        float[] notas =new float[num];
        Tools.println("Qual seu nome?");
        Pessoa pessoa = new Pessoa(Tools.scanfStr());
        Aluno aluno = new Aluno(pessoa);
        for(int i =0;i<num;i++){
            Tools.println(aluno.getNome()+" Qual sua nota da prova "+(i+1));
            notas[i]=Tools.scanffloat();            
        }
        Prova prova = new Prova(notas);
        float media = prova.media();
        Tools.printFormat(aluno.getNome()+" Sua media foi %.2f",media);
      
    }
    
}

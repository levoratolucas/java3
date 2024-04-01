// Exe08.java
// 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
// Calcular  a  sua  média  (aritmética),  informar  o  nome  e  sua  menção  aprovado  (media  >=  7), 
// Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).

package classes;

public class Exe08 {
    public static void executar(){
        int num = 3;
        String  msg ="aprovado";
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
        if(media <=5){
            msg ="reprovado";
        }
        else if(media <7 && media>5){
            msg="Recuperação";
        }

        Tools.printFormat(aluno.getNome()+" Sua media foi %.2f Então voce está "+msg,media);
        
    }
    
}

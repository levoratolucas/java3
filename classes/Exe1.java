package classes;
import classes.Aluno;
import classes.Prova;
import classes.Tools;
public class Exe1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("lucas",29);
        Prova prova = new Prova("ads",10,8,7);      
        float nota = prova.nota[0];
        Tools.printFormat("media %.2f", nota); 
        
    }
    
}

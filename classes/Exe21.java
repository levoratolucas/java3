// ./Exe21.java
// 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes 
// categorias: 
// Infantil A = 5 - 7 anos 
// Infantil B = 8 - 10 anos 
// juvenil A = 11- 13 anos 
// juvenil B = 14 - 17 anos 
// Sênior = 18 - 25 anos 
// Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

package classes;

public class Exe21 {
    public static void executar(){
        Pessoa pessoa;
        Tools.println("Qual a idade do nadador?");
        pessoa = new Pessoa(Tools.scanfInt());
        Nadador nadador = new Nadador(pessoa);
        Tools.println(nadador.getCategoria());
    }
    
}

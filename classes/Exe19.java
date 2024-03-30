// ./Exe19.java
// 19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de 
// um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou 
// escaleno. 
// Propriedade:  o  comprimento  de  cada  lado  de  um  triângulo  é  menor  do  que  a  soma  dos 
// comprimentos dos outros dois lados. 
// Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
// Triângulo  Isóscele:  aquele  que  tem  os  comprimentos  de  dois  lados  iguais.  Portanto,  todo 
// triângulo equilátero é também isóscele; 
// Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.

package classes;

public class Exe19 {
    public static void executar(){
        Triangulo triangulo = new Triangulo();
        for(int i =0;i<3;i++){
            Tools.printFormat("Qual o tamanho do %d° lado\n",i+1);
            triangulo.setLado(Tools.scanfInt(),i);
        }
        Tools.println("O triangulo é "+triangulo.gerarTipo(triangulo.getLado()));
    }
    
}

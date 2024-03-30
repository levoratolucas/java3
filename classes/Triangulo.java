// ./Triangulo.java
// Propriedade:  o  comprimento  de  cada  lado  de  um  triângulo  é  menor  do  que  a  soma  dos comprimentos dos outros dois lados. 
// Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
// Triângulo  Isóscele:  aquele  que  tem  os  comprimentos  de  dois  lados  iguais.  Portanto,  todo 
// triângulo equilátero é também isóscele; 
// Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.
package classes;

public class Triangulo {
    private int[] lados = new int[3];
    private String tipo;
    public void setLado(int lado, int i){
        this.lados[i]=lado;
    }
    public int[] getLado(){
        return lados;
    }
    public String gerarTipo(int[] lds){
        lados=lds;
        if(lados[0]>lados[1]+lados[2] || lados[1]>lados[0]+lados[2] ||lados[2]>lados[1]+lados[0]){
            return "Invalido";
        }else if(lados[0]== lados[1] && lados[1] == lados[2] ){
            tipo = "Triângulo Equilátero e Triângulo Isóscele";
        }else if(lados[0]== lados[1] || lados[1] == lados[2] || lados[0] == lados[2] ){
            tipo = "Triângulo Isóscele";
        }else if(lados[0]!= lados[1] && lados[1] != lados[2] ){
            tipo = "Triângulo Escaleno";
        }
        return tipo;
    }
    
}

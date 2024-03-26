package classes;

public class Carr {
    private float valor;    
    public Carr(float v){
        this.valor = v;
    }
    public double calcular(){
        return (valor * 1.28)*1.45;
    }
}

package classes;

public class Loja {
    float valorcompra;
    public Loja(float v){
        this.valorcompra = v;
    }
    public String calcular(){
        String msg = String.format("Sua Prestação sera de %.2f",valorcompra/5);
        return msg;
    }
}

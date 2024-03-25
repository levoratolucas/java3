package classes;

public class Produto {
    float precoCusto,acrescimo;
    public Produto(float p, float a){
        this.precoCusto =p;
        this.acrescimo=a;
    }
    public float calcular(){
        return precoCusto = precoCusto * (1+(acrescimo/100));
    }
}

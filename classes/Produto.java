package classes;

public class Produto {
    public float precoCusto,acrescimo;
    private float precoVenda;



    public Produto(float p){
        this.precoCusto =p;        
    }
    public Produto(float p, float a){
        this.precoCusto =p;
        this.acrescimo=a;
    }
    public void setPrecoVenda(float p){
        this.precoVenda=p;
    }
    public float getPrecoVenda(){
        return precoVenda;
    }
    public float getPrecoCusto(){
        return precoCusto;
    }
    public float calcular(){
        return precoCusto = precoCusto * (1+(acrescimo/100));
    }
}

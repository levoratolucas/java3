package classes;
import java.util.ArrayList;
import java.util.List;


public class Loja {
    float valorcompra;
    private List<Produto> produtos;

    public void setProduto(Produto produto){
        this.produtos.add(produto);
    }
    public Produto getProduto(int i){
        return produtos.get(i);
    }
    public Loja(){       
        this.produtos = new ArrayList<>();
    }
    public Loja(float v){
        this.valorcompra = v;
        this.produtos = new ArrayList<>();
    }
    public String calcular(){
        String msg = String.format("Sua Prestação sera de %.2f",valorcompra/5);
        return msg;
    }
}

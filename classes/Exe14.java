// ./Exe14.java
// 14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre 
// como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de 
// custo e do preço de venda

package classes;

public class Exe14 {
    public static void executar(){
        Produto[] produtos = new Produto[40];
        Loja loja = new Loja();
        for(int i = 0;i<produtos.length;i++){
            Tools.printFormat("qual o valor de custo do %d° produto\n",i+1);
            produtos[i] = new Produto(Tools.scanffloat());

            Tools.printFormat("qual o valor de venda do %d° produto\n",i+1);
            produtos[i].setPrecoVenda(Tools.scanffloat());
            
            loja.setProduto(produtos[i]);
        }
        float mediaVenda =0,j=0,mediaCusto=0;
        String msg = "empate";
        for(int i = 0;i<produtos.length;i++){
            j++;
            float lucro = loja.getProduto(i).getPrecoVenda() - loja.getProduto(i).getPrecoCusto(); 
            mediaVenda += loja.getProduto(i).getPrecoVenda();
            mediaCusto += loja.getProduto(i).getPrecoCusto();
            if(lucro >0){
                msg = "lucro";
            }else 
            if(lucro < 0){
                msg = "prejuízo";
            }
            Tools.printFormat("O %d° produto teve %s \n", i+1,msg);            
        }
     Tools.printFormat("\nmedia de Venda é %.2f", mediaVenda / j); 
     Tools.printFormat("\nmedia de Custo é %.2f", mediaCusto / j); 
       
    }
    
}

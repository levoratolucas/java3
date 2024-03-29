package classes;

public class Carr {
    private String marca,modelo;
    private int ano=-1;
    private double valor;   



    public Carr(){} 
    
    public Carr(String mr){
        marca=mr;
    } 
    public Carr(String mr,String m){
        marca=mr;
        modelo=m;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int a){
        if(ano ==-1){
            ano =a;
        }
    }
    public void setMarca(String mr){
        if(marca == null){
            marca =mr;
        }
    }
    public void setValor(double v){        
            valor =v;        
    }
    public void setModelo(String m){
        if(modelo ==null){
            modelo =m;        }
    }
    public Carr(float v){
        this.valor = v;
    }
    public double getValor(){
        return valor;
    }
    public double calcular(){
        return (valor * 1.28)*1.45;
    }
}

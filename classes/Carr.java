package classes;

public class Carr {
    private String marca, modelo;
    private int ano = -1, combustivel=0;
    private double valor;
    // combustivel --- 1 = gasolina --- 2 = alcool --- 3 = diesel

    public Carr() {
    }

    public Carr(String mr) {
        marca = mr;
    }

    public Carr(double v) {
        this.valor = v;
    }

    public Carr(String mr, String m) {
        marca = mr;
        modelo = m;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public int getCombustivel(){
        return combustivel;
    }

    public void setAno(int a) {
        if (ano == -1) {
            ano = a;
        }
    }

    public void setMarca(String mr) {
        if (marca == null) {
            marca = mr;
        }
    }

    public void setValor(double v) {
        valor = v;
    }

    public void setModelo(String m) {
        if (modelo == null) {
            modelo = m;
        }
    }

    public void setCombustivel(int c) {
        this.combustivel = c;
    }

    public double calcular() {
        return (valor * 1.28) * 1.45;
    }
}

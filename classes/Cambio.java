package classes;

public class Cambio {
    float dolar, cotação;

    public Cambio(float d, float c) {
        this.dolar = d;
        this.cotação = c;
    }
    public float calcular() {
        return dolar * cotação;
    }
}

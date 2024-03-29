package classes;

public class Prova {

    int num;
    public float[] notas;
    public String curso = new String();
    public String data;
    
    

    public Prova() {

    }

    public Prova(float[] n) {
        notas = new float[n.length];
        for(int i = 0; i< n.length;i++){
            notas[i]=n[i];
        }
    }
    public float media(){
        float soma =0;
        for(int i=0;i<notas.length;i++){
         soma+=notas[i];
        }
        return soma/notas.length;
     }
}

package classes;

public class Shopee {
    public static int calcular(int[] compras){
        int i=0;
        for (float C : compras) {        
           if(C>10 && C<150){i++;}}
        return i;
    }     
}

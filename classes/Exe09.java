// ./Exe09.java 
// 9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) 
// e 150 (inclusive).
package classes;

public class Exe09 {
    public static void executar(){
        Shopee shopee = new Shopee();
        int[] vetor = {43, 256, 98, 104, 12, 289, 73, 201, 150, 217, 292, 57, 165, 225, 84, 208, 13, 299, 206, 126, 55, 281, 183, 243, 177, 268, 232, 35, 184, 122, 191, 264, 107, 9, 68, 231, 79, 15, 271, 277, 142, 267, 114, 101, 181, 221, 291, 38, 26, 67, 151, 141, 250, 225, 156, 48, 149, 186, 222, 85, 295, 270, 125, 185, 52, 184, 183, 103, 18, 23, 96, 104, 87, 191, 89, 292, 167, 140, 92};
        Tools.printInt(shopee.calcular(vetor));
    }
}

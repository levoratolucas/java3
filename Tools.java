import java.util.Scanner;

public class Tools {

    public static void println(String msg){
        System.out.println(msg);
    }
    public static void printFormat(String format, Object... args){
        System.out.printf(format, args);
    }
    
    public static int scanfInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static float scanffloat() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
    public static String scanfStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printInt(int msg){
        System.out.println(msg);
    }
}

import java.util.Scanner;
 
public class Maquina {
     
    private static final Scanner teclado = new Scanner(System.in); 
     
    public static void main(String[] args) {
         
        final int PRECIO = 45;
        int centimos;
         
        do {
            System.out.print("\nCantidad introducida (en c�ntimos): ");
            centimos = teclado.nextInt();
            if(centimos<PRECIO){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos<PRECIO);
         
        if(centimos==PRECIO){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            centimos -= PRECIO;
            System.out.printf("%nEl cambio a devolver es el siguiente:");
            if(centimos/200>0){
                System.out.printf("%nMonedas de 2 euros: %d", centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.printf("%nMonedas de 1 euro: %d", centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.printf("%nMonedas de 50 c�ntimos: %d", centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.printf("%nMonedas de 20 c�ntimos: %d", centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.printf("%nMonedas de 10 c�ntimos: %d", centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.printf("%nMonedas de 5 c�ntimos: %d", centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.printf("%nMonedas de 2 c�ntimos: %d", centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.printf("%nMonedas de 1 c�ntimo: %d", centimos);
            }
        }
        System.out.printf("%n%nGracias por su compra"); 
    }
}
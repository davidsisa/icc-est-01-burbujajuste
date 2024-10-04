import java.util.Scanner;

public class Validar {
public static int leerEnteroValido (Scanner s , boolean numerosNegativos ) {

            int num = 0;

            do {
                System.out.println("Ingrese el tamanio que sea positivo");
                while (!s.hasNextInt() ){
                    System.out.println("Cualquier mensaje");
                    s.next();
    
    
    
                }
                num = s.nextInt();
                if (num<=0 || numerosNegativos) {
                    System.out.println("El tamanio debe ser un entero positivo");
                }
               } while (num<=0) ;
    
                int[] arreglo = new int[num];
    
                for (int i = 0; i < num; i++) {
                    System.out.print("Introduce el elemento " + (i + 1) + ": ");
                    arreglo[i] = s.nextInt();
                }
    
    
                s.close();
    
    
    
    
                return num;
    

        }
}

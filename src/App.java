import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Validar ordenar = new Validar ();
        int tamanio = ordenar.leerEnteroValido(leer,false);
        System.out.println(tamanio);
    }
}

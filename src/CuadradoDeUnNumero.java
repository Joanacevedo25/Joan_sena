import java.util.Scanner;
public class CuadradoDeUnNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Calcular el cuadrado del número
        double cuadrado = numero * numero;

        // Imprimir el resultado
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        // Cerrar el Scanner
        scanner.close();
    }
}

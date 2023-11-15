import java.util.Scanner;
public class ConvertirEurosADolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en euros
        System.out.print("Ingresa la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Definir la tasa de cambio (1 euro a dólar)
        double tasaCambio = 1.15; // Debes usar la tasa de cambio actual

        // Realizar la conversión a dólares
        double dolares = euros * tasaCambio;

        // Imprimir el resultado
        System.out.println(euros + " euros son equivalentes a " + dolares + " dólares.");

        // Cerrar el Scanner
        scanner.close();
    }
}

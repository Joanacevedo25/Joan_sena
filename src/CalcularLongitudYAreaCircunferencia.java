import java.util.Scanner;
public class CalcularLongitudYAreaCircunferencia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular la longitud de la circunferencia
        double longitudCircunferencia = 2 * Math.PI * radio;

        // Calcular el área del círculo inscrito
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2);

        // Imprimir los resultados
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println("El área del círculo inscrito es: " + areaCirculoInscrito);

        // Cerrar el Scanner
        scanner.close();
    }
}


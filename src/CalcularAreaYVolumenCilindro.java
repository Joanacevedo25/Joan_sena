import java.util.Scanner;
public class CalcularAreaYVolumenCilindro {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio de la base del cilindro
        System.out.print("Ingresa el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitar al usuario que ingrese la altura del cilindro
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el área de la superficie del cilindro
        double areaSuperficie = 2 * Math.PI * radio * (radio + altura);

        // Calcular el volumen del cilindro
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Imprimir los resultados
        System.out.println("El área de la superficie del cilindro es: " + areaSuperficie);
        System.out.println("El volumen del cilindro es: " + volumen);

        // Cerrar el Scanner
        scanner.close();
    }
}

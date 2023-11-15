import java.util.Scanner;
public class AreaTriangulo {
    public static void main (String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner (System.in);
        // Solicitar al usuario que ingrese la base del triángulo
        System.out.print("Ingresa la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();
        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();
        // Calcular el área del triángulo
        double area = (base * altura) / 2;
        // Imprimir el resultado
        System.out.println("El área del triángulo es: " + area);
        // Cerrar el Scanner
        scanner.close();
    }
}

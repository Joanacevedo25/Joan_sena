import java.util.Scanner;
public class CalcularAreaYPerimetroCuadrado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud del lado del cuadrado
        System.out.print("Ingresa la longitud del lado del cuadrado: ");
        double lado = scanner.nextDouble();

        // Calcular el área del cuadrado (lado * lado)
        double area = lado * lado;

        // Calcular el perímetro del cuadrado (4 * lado)
        double perimetro = 4 * lado;

        // Imprimir el resultado
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        // Cerrar el Scanner
        scanner.close();
    }
}


import net.salesianos.Actividad1.Figuritas.Circulo;
import net.salesianos.Actividad1.Figuritas.Rectangulo;
import java.util.Scanner;

public class MainDeLaActividad1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarDatosRectangulo();
        System.out.println();
        mostrarDatosCirculo();

        scanner.close();
    }

    //  Rectángulo 

    private static void mostrarDatosRectangulo() {
        System.out.println(">== RECTÁNGULO ==<");

        double base   = pedirDecimal("Introduce la base del rectángulo: ");
        double altura = pedirDecimal("Introduce la altura del rectángulo: ");

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.printf(">> Resultados del Rectángulo");
        System.out.printf("    Base    : " + rectangulo.getBase());
        System.out.printf("    Altura  : " + rectangulo.getAltura());
        System.out.printf("    Área    : " + rectangulo.calcularArea());
        System.out.printf("    Perímetro: " + rectangulo.calcularPerimetro());
    }

    // Círculo 

    private static void mostrarDatosCirculo() {
        System.out.println(">== CÍRCULO ==<");

        double radio = pedirDecimal("Introduce el radio del círculo: ");

        Circulo circulo = new Circulo(radio);

        System.out.printf(">> Resultados del Círculo");
        System.out.printf("    Radio     : " + circulo.getRadio());
        System.out.printf("    Área      : " + circulo.calcularArea());
        System.out.printf("    Perímetro : " + circulo.calcularPerimetro());
    }

    private static double pedirDecimal(String mensaje) {
        double valor = -1;
        while (valor <= 0) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(scanner.nextLine().trim());
                if (valor <= 0) {
                    System.out.println("  [!] El valor debe ser mayor que 0. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("  [!] Entrada no válida. Introduce un número decimal.");
            }
        }
        return valor;
    }
}
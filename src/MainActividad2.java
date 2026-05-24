// import net.salesianos.Actividad2.VolanteGiraGira.Coche;
import net.salesianos.Actividad2.ElCoche.porscheGT3RS;  

public class MainActividad2 {

    public static void main(String[] args) {
        porscheGT3RS coche = new porscheGT3RS(  
                "Rojo",
                2,
                4,
                "Porsche GT3 RS",
                "1234-ABC",
                20.0
        );
        System.out.println("Coche creado: " + coche);

        separador("Intentando mover antes de arrancar");
        coche.VolanteGiraGira();

        separador("Arrancando el motor");
        coche.BRUM();

        separador("Moviendo el coche 5 veces");
        for (int i = 1; i <= 5; i++) {
            System.out.print("  Movimiento " + i + ": ");
            coche.VolanteGiraGira();
        }

        separador("Nivel de combustible actual");
        System.out.println("  Combustible restante: " + coche.getLitrosCombustible()); 

        separador("Modificando combustible a 2 litros y moviendo 3 veces");
        coche.setLitrosCombustible(2.0); 

        for (int i = 1; i <= 3; i++) {
            System.out.print("  Movimiento extra " + i + ": ");
            coche.VolanteGiraGira();
        }

        System.out.println("Estado final del coche: " + coche);
    }

    private static void separador(String titulo) {
        System.out.println(">" + titulo + " " + "─".repeat(Math.max(0, 44 - titulo.length())));
    }
}

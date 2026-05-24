package net.salesianos.Actividad2.ElCoche;

import net.salesianos.Actividad2.VolanteGiraGira.Coche;

public class porscheGT3RS extends Coche {

    private boolean motorEncendido;
    private double litrosCombustible; 
    
    public porscheGT3RS(String color, int numeroPuertas, int numeroRuedas,
        String modelo, String matricula, double litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }

//  
    public boolean isMotorEncendido() { 
        return motorEncendido; 
    }
 
    public double getLitrosCombustible() { 
        return litrosCombustible; 
    }
 
    public void setLitrosCombustible(double litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
        System.out.println("Nivel actualizado a " +  litrosCombustible + " litros.");
    }

    @Override
    public void BRUM() {
        if (litrosCombustible <= 0) {
            System.out.println("Chacho ni 10€ le pusiste colega, no arranca ni de coña.");
            return;
        }
        litrosCombustible -= 1;
        motorEncendido = true;
        System.out.println("Motor encendido. Combustible restante:" + litrosCombustible);
    }

    @Override
    public void GasolinaCara() {
        motorEncendido = false;
        System.out.println("El motor se ha apagado.");
    }
    @Override
    public void VolanteGiraGira() {
        if (!motorEncendido) {
            System.out.println("La llave en el contacto colegin ¿pero quien la gira?.");
            GasolinaCara();
            return;
        }
        if (litrosCombustible <= 0) {
            System.out.println("CHACHO TE DIJE QUE PARARAS EN LA DISA. AHORA SE APAGA EL MOTOR POR BOBO.");
            GasolinaCara();
            return;
        }
        litrosCombustible -= 1;
        System.out.println("[MOVER] El coche se ha movido. Combustible restante: " + litrosCombustible + " litros.");
    }
 
//   ATENCION COSA MANDADA POR COPI SE LA MANDO DURO PORQUE NO SABIA QUE SE PODIA HACER ESo
    @Override
    public String toString() {
        return String.format("CocheCombustion { modelo='%s', matrícula='%s', color='%s', puertas=%d, ruedas=%d, motor=%s, combustible=%.1f L }",
                modelo, matricula, color, numeroPuertas, numeroRuedas, motorEncendido ? "ON" : "OFF", litrosCombustible);
    }
}

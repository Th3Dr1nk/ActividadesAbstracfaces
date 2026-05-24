package net.salesianos.Actividad1.Figuritas;

import net.salesianos.Actividad1.Interfaz.CalculoMat;

public class Circulo implements CalculoMat  {

    private double radio;

    // Constructor, getters, setters y 39 tipos de gays

    public Circulo(double radio) {
        this.radio = radio;
    }

     public double getRadio() {
        return radio;
    }

     @Override
    public double calcularArea() {
        return 3.1415 * radio * radio;
    }
 
    @Override
    public double calcularPerimetro() {
        // Perímetro / circunferencia = 2 * π * r
        return 2 * 3.1415 * radio;
    }
}
    // Teacher  te mando un 3.1415 mas que nada porque ni en broma pongo todo el numero de pi.
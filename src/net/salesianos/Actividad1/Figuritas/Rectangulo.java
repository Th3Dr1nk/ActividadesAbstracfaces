package net.salesianos.Actividad1.Figuritas;

import net.salesianos.Actividad1.Interfaz.CalculoMat;

public class Rectangulo implements CalculoMat {  

    private double base;
    private double altura;
    
// Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

//  Getters
    public double getBase() {
        return base;
    }
 
    public double getAltura() {
        return altura;
    }

// La vaina esa del Override
    @Override
    public double calcularArea() {
        return base * altura;
    }
 
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}


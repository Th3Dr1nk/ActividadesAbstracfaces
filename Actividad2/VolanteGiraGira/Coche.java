package net.salesianos.Actividad2.VolanteGiraGira;

public abstract class Coche {
    
    protected String color;
    protected int numeroPuertas;
    protected int numeroRuedas;
    protected String modelo;
    protected String matricula;

    // Constructor
    
    public Coche(String color, int numeroPuertas, int numeroRuedas,
                    String modelo, String matricula) {
        this.color         = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas  = numeroRuedas;
        this.modelo        = modelo;
        this.matricula     = matricula;
    }

    // Getters y Setters
    public String getColor() { 
        return color; 
    }
    public void setColor(String color) {
        this.color = color; 
        }
 
    public int getNumeroPuertas() { 
        return numeroPuertas; 
    }
    public void setNumeroPuertas(int numeroPuertas) { 
        this.numeroPuertas = numeroPuertas; 
    }
 
    public int getNumeroRuedas() { 
        return numeroRuedas; 
    }
    public void setNumeroRuedas(int numeroRuedas) { 
        this.numeroRuedas = numeroRuedas; 
    }
 
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
 
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { 
        this.matricula = matricula; 
    }

    // "Arranca" el vehículo.
    public abstract void BRUM();
 
    
    // Para el motor del vehículo.
     
    public abstract void GasolinaCara();
 
    // Mueve el vehículo.
    
    public abstract void VolanteGiraGira();
}

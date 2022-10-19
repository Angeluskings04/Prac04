/**
 * Practrica 04
 * Actividad 1
 * 
 * @author Castro Reyes Angel
 * @version 1.0
 **/

public class Automovil {

    // Atributos
    String compania;
    String marca;
    String color;
    double capacidadTotal;
    double capacidadActual;
    boolean estado;

    public Automovil(){

    }

    public Automovil(String c,String m, String co, double cT, double cA, boolean es){
        compania = c;
        marca = m;
        color = co;
        capacidadTotal = cT;
        capacidadActual = cA;
        estado = es;
    }

    /**
     * Método que permite conocer la compania del auto.
     * 
     * @return Sting la compania del auto.
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Método que permite conocer la marca del auto.
     * 
     * @return Sting la marca del auto.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que permite conocer la marca del auto.
     * 
     * @return Sting la marca del auto.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que permite conocer la cantidad de gasolina que puede tener el auto.
     * 
     * @return double la Capacidad Tota del auto.
     */
    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    /**
     * Método que permite conocer la cantidad de gasolina que tiena ahora el carro.
     * 
     * @return double la Capacidad Actual del auto.
     */
    public double getCapacidadActual() {
        return capacidadActual;
    }

    /**
     * Método que permite conocer el estado del carro(encendido o apagado).
     * 
     * @return boolean el estado del auto.
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Método que permite modificar el color del auto.
     * 
     * @param String el nuevo color del auto.
     */
    public void setColor(String a) {
        this.color = a;
    }

    /**
     * Método que permite modificar la contidad de gasolina.
     * 
     * @param double cuanta gasolina se agrega.
     */
    public void setEstado(double a) {
        this.capacidadActual = a;
    }

    /**
     * Metodo para cambiar el estado del auto de encendido a apagado.
     */
    public boolean apagarAuto() {
        if (estado == true) {
            this.estado = false;
            System.out.println("El auto esta apagado");
            return estado;
        } else {
            System.out.println("El auto esta apagado");
            return estado;
        }
    }

    /**
     * Metodo para cambiar el estado del auto de apagado a encendido.
     */
    public boolean encencerAuto() {
        if (estado == false) {
            this.estado = true;
            System.out.println("El auto esta encendido");
            return estado;
        } else {
            System.out.println("El auto esta encendido");
            return estado;
        }
    }
    
    /**
    * @Override
    */
    public String toString(){
        String autoIMP = "Marca: " + marca + "\n" +
                "Compañia: " + compania + "\n" +
                "Color: " + color;
        
        return autoIMP;
    }
        
}
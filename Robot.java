/**
 * Practrica 04
 * Actividad 1
 * 
 * @author Castro Reyes Angel
 * @version 1.0
 **/

public class Robot {

    // Estado de encendido o apagado del robot.
    boolean estado;

    // El constructor vacio istancia al robot encendido
    public Robot() {
        this.estado = true;
    }

    // Constructor por parametros
    public Robot(boolean estado) {
        this.estado = estado;
    }

    /**
     * Método que permite conocer la cantidad de canicas del usuario
     * 
     * @return boolean el estado del robot
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Método que permite modificar el estado del robot.
     * 
     * @param boolean el nuevo estado del robot.
     */
    public void setEstado(boolean a) {
        this.estado = a;
    }

    /**
     * Metodo para cambiar el estado del robot de encendido a apagado.
     */
    public boolean apagarRobot() {
        if (estado == true) {
            this.estado = false;
            System.out.println("El robot esta apagado");
            return estado;
        } else {
            System.out.println("El robot esta apagado");
            return estado;
        }
    }

    /**
     * Metodo para cambiar el estado del robot de apagado a encendido.
     */
    public boolean encencerRobot() {
        if (estado == false) {
            this.estado = true;
            System.out.println("El robot esta encendido");
            return estado;
        } else {
            System.out.println("El robot esta encendido");
            return estado;
        }
    }

    public int operacionesBasicas(String decisionAleatoria, int operando1, int operando2){

        switch(decisionAleatoria){

            case 1:
                int resultando = operando1 + operando2;

        }
    }

    public String toString(){
        return "Estado: " + estado; 
    }
}
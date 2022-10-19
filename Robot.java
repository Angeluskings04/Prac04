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
            System.out.println("\n" + "El robot esta apagado" + "\n");
            return estado;
        } else {
            System.out.println("\n" + "El robot esta apagado" + "\n");
            return estado;
        }
    }

    /**
     * Metodo para cambiar el estado del robot de apagado a encendido.
     */
    public boolean encencerRobot() {
        if (estado == false) {
            this.estado = true;
            System.out.println("\n" + "El robot esta encendido" + "\n");
            return estado;
        } else {
            System.out.println("\n" + "El robot esta encendido" + "\n");
            return estado;
        }
    }

    public int operacionesBasicas(int decisionAleatoria, int operando1, int operando2) {
        int resultado = 0;
        if (1 == decisionAleatoria) {
            resultado = operando1 + operando2;
            System.out.println(" " + operando1 + " + " + operando2);
        } else if (2 == decisionAleatoria) {
            resultado = operando1 - operando2;
            System.out.println(operando1 + " - " + operando2 + " ");
        }
        return resultado;
    }

    public int operacionesIntermedias(int decisionAleatoria, int operando1, int operando2, int operando3) {
        int resultado = 0;
        if (1 == decisionAleatoria) {
            resultado = operando1 + operando2 + operando3;
            System.out.println(" " + operando1 + " + " + operando2 + " + " + operando3);
        } else if (2 == decisionAleatoria) {
            resultado = operando1 - operando2 - operando3;
            System.out.println(operando1 + " - " + operando2 + " - " + operando3);
        } else if (3 == decisionAleatoria) {
            resultado = operando1 * operando2 * operando3;
            System.out.println(operando1 + " * " + operando2 + " * " + operando3);
        }
        return resultado;
    }

    public int operacionesAvanzadas(int decisionAleatoria, int operando1, int operando2, int aux) {
        int resultado = 0;
        if (decisionAleatoria == 1) {
            resultado = operando1 + operando2;
            System.out.println(" " + operando1 + " + " + operando2);
        } else if (decisionAleatoria == 2) {
            resultado = operando1 - operando2;
            System.out.println(operando1 + " - " + operando2 + " ");
        } else if (decisionAleatoria == 3) {
            resultado = operando1 * operando2;
            System.out.println(operando1 + " * " + operando2);
        } else if (decisionAleatoria == 4) {
            if (operando1 < operando2) {
                operando1 += (operando2 - operando1) + aux;
                resultado = operando1 / operando2;
                System.out.println(operando1 + " / " + operando2 + " ");
            } else {
                resultado = operando1 / operando2;
                System.out.println(operando1 + " / " + operando2 + " ");
            }
        }
        return resultado;
    }

    public String toString() {
        return "Estado: " + estado;
    }
}
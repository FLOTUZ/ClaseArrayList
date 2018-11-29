package Herencia2;

import java.util.Scanner;

public class EmpleadoEspecializado extends Empleado  implements RH{

    EmpleadoEspecializado(Scanner leer){
        super(leer);
    }

    @Override
    public double calcularSueldo() {
        double sueldoFinal;
        if (getPuesto().equalsIgnoreCase("Plomero")) {
            sueldoFinal = getSueldo() + 100;    //Bono a plomero
        }
        else {sueldoFinal = (float) (getSueldo() + (getSueldo()*.5));}
        return sueldoFinal;
    }
}
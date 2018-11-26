package Herencia2;

import java.util.Scanner;

public class EmpleadoEspecializado extends Empleado  implements RH{

    EmpleadoEspecializado(Scanner leer){
        super(leer);
    }

    @Override
    public double calcularSueldo() {
        float sueldoFinal = (float) (getSueldo() + (getSueldo()*.5));
        return sueldoFinal;
    }
}
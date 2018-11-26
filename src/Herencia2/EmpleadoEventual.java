package Herencia2;

import java.util.Scanner;

public class EmpleadoEventual extends Empleado implements RH {
    EmpleadoEventual(Scanner leer){
        super(leer);
    }
    @Override
    public double calcularSueldo() {
        return 0;
    }
}

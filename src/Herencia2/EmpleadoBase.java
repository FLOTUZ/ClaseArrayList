package Herencia2;


import java.util.Scanner;

public class EmpleadoBase extends Empleado implements RH {
    EmpleadoBase(Scanner leer){
        super(leer);
    }

    @Override
    public double calcularSueldo() {
        double sueldo = 0;
        if (getPuesto().equalsIgnoreCase("Secretaria")){
            sueldo += sueldo*.50;   //Se le aumenta el sueldo al empleado en caso de ser seretaria
        }
        return sueldo;
    }
}

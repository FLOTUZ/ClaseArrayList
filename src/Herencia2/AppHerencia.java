package Herencia2;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AppHerencia {

    public static void main(String[] args) throws FileNotFoundException {
        File datos = new File("datos.txt");
        Scanner leer = new Scanner(datos);
        //Empleado[] trabajador = new Empleado[3];

        ArrayList<Empleado> trabajador = new ArrayList<>();

        while (leer.hasNext()) {
            String tipo = leer.next();
            if (tipo.equalsIgnoreCase("B")) {
                trabajador.add(new EmpleadoBase(leer));
            }
            if (tipo.equalsIgnoreCase("E")) {
                trabajador.add(new EmpleadoEventual(leer));
            }
            if (tipo.equalsIgnoreCase("EE")) {
                trabajador.add(new EmpleadoEspecializado(leer));
            }
        }

        System.out.println("\t\t\tEmpleados");
        System.out.println("\nEmpleados Base\n");

        for (Empleado i : trabajador) {
            if (i instanceof EmpleadoBase) {
                System.out.println(i);
            }
        }
        /*System.out.println("Empleados eventuales\n");
        for (Empleado i : trabajador) {
            if (i instanceof EmpleadoEventual) {
                System.out.println(i);
            }
        }*/
        System.out.println("\nEmpleados Especializados\n");
        for (Empleado i : trabajador) {
            if (i instanceof EmpleadoEspecializado) {
                if (i.getTipo().equalsIgnoreCase("Plomero")) {
                    System.out.println(i);
                }else {System.out.println(i);}
            }
        }
    }
}

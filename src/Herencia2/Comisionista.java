package Herencia2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Comisionista extends Empleado implements RH {
    private double ventas;
    public File datos = new File("ventas.txt");
    public Scanner leerventas = new Scanner(datos);

    Comisionista(Scanner leer) throws FileNotFoundException {
        super(leer);
        this.ventas = leerventas.nextDouble();
    }

    public double getVentas() {
        return ventas;
    }


    public double calcularBono() {
        double bono = 0;
        if (getVentas()>= 3000.0){
            bono += getVentas()+(getVentas()*.10);
        }
        return bono;
    }

    @Override
    public double calcularSueldo() {
        return getVentas() + calcularBono();
    }
}

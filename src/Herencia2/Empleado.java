package Herencia2;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    protected String tipo;
    private String puesto ;
    private byte faltas;
    private float sueldo;

    Empleado(){     }   //Costructor

    public Empleado(Scanner leer){
        this.tipo = leer.next();
        this.nombre = leer.next();
        this.puesto = leer.next();
        this.faltas= leer.nextByte();
        this.sueldo = leer.nextFloat();
    }

    public String getTipo() {
        return tipo;
    }

    public String getPuesto() {
        return puesto;
    }

    public byte getFaltas() {
        return faltas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    public double calcularSueldo(){

        return 0;
    }

    public String toString(){
        return tipo + "\t" + nombre +"\t"
                +puesto +"\t" + faltas + "\t" + sueldo + "\t" + calcularSueldo();
    }
}

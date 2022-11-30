package org.example.controladores;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    Scanner entradaPorTeclado = new Scanner(System.in);

    //ATRIBUTOS

    private String id, nombre, apellido, cargo;
    private int edad;
    private double salario;

    //CONSTRUCTOR


    public Empleado() {
    }

    public Empleado(String id, String nombre, String apellido, String cargo, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;
    }

    //METODOS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while (edad <=17){
            System.out.print("La edad minima debe de ser 18 años, ingrese nuevamente la edad: ");
            edad = entradaPorTeclado.nextInt();
        }
        this.edad=edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodo de validacion
    public Empleado buscarEmpleado (ArrayList<Empleado> empleados, String id){
        Empleado empleadoEncontrado = null;
        for (Empleado empleado:empleados) {
            if (empleado.getId().equals(id)){

                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    public void calcularBono (Viaje empleadoEncontrado, Empleado empleado ){

        switch (empleado.getCargo()){

            case "JR":
                if (empleadoEncontrado.getTipoViaje().equals("Nacional")){
                    empleado.setSalario(empleado.getSalario()+(0.2*empleado.getSalario()));
                    System.out.println("El empleado recibio un bono del 20% de su salario");
                }else if (empleadoEncontrado.getTipoViaje().equals("Internacional")){
                    empleado.setSalario(empleado.getSalario()+(0.4*empleado.getSalario()));
                    System.out.println("El empleado recibio un bono del 40% de su salario");
                }
                break;

            case "SR":
                if (empleadoEncontrado.getTipoViaje().equals("Nacional")){
                    empleado.setSalario(empleado.getSalario()+(0.3*empleado.getSalario()));
                    System.out.println("El empleado recibio un bono del 30% de su salario");
                }else if (empleadoEncontrado.getTipoViaje().equals("Internacional")){
                    empleado.setSalario(empleado.getSalario()+(0.5*empleado.getSalario()));
                    System.out.println("El empleado recibio un bono del 50% de su salario");
                }
                break;
        }


    }


}

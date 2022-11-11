package org.example.controladores;

public class Empleado {

    //ATRIBUTOS

    private String id,nombreCompleto,cargo;
    private int edad;
    private double salario;

    //CONSTRUCTOR


    public Empleado() {
    }

    public Empleado(String id, String nombreCompleto, String cargo, int edad, double salario) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
        if(edad<18){
            System.out.println("No puedes ser empleado, porque eres menor de edad.");
        } else if(edad>=62){
            System.out.println("No puedes ser empleado, ya estas jubilado.");
        } else{
            this.edad=edad;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

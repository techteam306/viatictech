package org.example;

import org.example.controladores.Empleado;
import org.example.controladores.Viaje;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        Empleado objetoEmpleado = new Empleado();
        Viaje objetoViaje = new Viaje();
        ArrayList<Empleado> empleados = new ArrayList<>();

        //Creando menú
        int variableDeControl = 0;
        System.out.println("""
                    -------------------------------------------
                    |                Viatictech               |""");
        do{
            System.out.printf("""
                    -------------------------------------------
                    |Menu                                     |
                    -------------------------------------------
                    | 1.      Registro de empleado            |
                    | 2.      Registro de viaje               |
                    | 3.      Ver empleados                   |
                    | 4.      Ver viajes de un empleado       |
                    | 0.      Salir                           |
                    -------------------------------------------
                           Digita una opcion del menu:\s""");
            variableDeControl = entradaPorTeclado.nextInt();

            switch (variableDeControl){
                case 1:
                        System.out.println("\nRegitro de un empleado ");
                        System.out.print("-Ingrese el documento del empleado: ");
                        String id = entradaPorTeclado.next();

                    if (objetoEmpleado.buscarEmpleado(empleados, id)==null) {
                        objetoEmpleado.setId(id);
                        System.out.print("-Ingrese nombre del empleado: ");
                        objetoEmpleado.setNombre(entradaPorTeclado.next());
                        System.out.print("-Ingrese apellido del empleado: ");
                        objetoEmpleado.setApellido(entradaPorTeclado.next());
                        System.out.print("-Ingrese edad del empeado: ");
                        objetoEmpleado.setEdad(entradaPorTeclado.nextInt());
                        System.out.print("-Ingrese cargo analista (JR/SR): ");
                        objetoEmpleado.setCargo(entradaPorTeclado.next());
                        System.out.print("-Ingrese salario del empleado: $");
                        objetoEmpleado.setSalario(entradaPorTeclado.nextDouble());

                        empleados.add(objetoEmpleado);

                    }else {
                        System.out.println("El empleado ya existe.");
                    }
                    break;

                case 2:
                    System.out.println("\nRegistro de un viaje");
                    System.out.print("-Ingrese fecha de ida: ");
                    objetoViaje.setFechaIda(entradaPorTeclado.next());
                    System.out.print("-Ingrese fecha de regreso: ");
                    objetoViaje.setFechaVuelta(entradaPorTeclado.next());
                    System.out.print("-Ingrese lugar de origen: ");
                    objetoViaje.setOrigen(entradaPorTeclado.next());
                    System.out.print("-Ingrese lugar de destino: ");
                    objetoViaje.setDestino(entradaPorTeclado.next());
                    System.out.print("-Ingrese tipo de viaje (Nacional/Internacional): ");
                    objetoViaje.setTipoViaje(entradaPorTeclado.next());
                    System.out.print("-Ingrese tipo de transporte (Bus/Avion): ");
                    objetoViaje.setTipoTransporte(entradaPorTeclado.next());
                    System.out.print("-Ingrese valor del ticket: $");
                    objetoViaje.setValorViaje(entradaPorTeclado.nextInt());


                    break;

                case 3:
                    System.out.println("Esta es la opcion 3");
                    break;
                case 4:
                    System.out.println("Esta es la opcion 4");
                    break;
                case 0:
                    System.out.println("Saliste del Viatictech");
                default:
                    System.out.println("Opcion no valida");
            }
        }while (variableDeControl !=0);
    }
}
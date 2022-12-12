package org.example;

import org.example.controladores.Empleado;
import org.example.controladores.Viaje;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        Viaje objetoViaje = new Viaje();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Viaje> viajes = new ArrayList<>();
        Empleado objetoEmpleado = new Empleado();

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
                        objetoEmpleado = new Empleado();
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
                        System.out.println("El empleado ya existe.\n");
                    }
                    break;

                case 2:
                    objetoViaje = new Viaje();
                    System.out.print("-Ingrese el documento del empleado: ");
                    id = entradaPorTeclado.next();
                    Empleado empleadoEncontrado = objetoEmpleado.buscarEmpleado(empleados, id);
                    if (empleadoEncontrado!=null) {
                        objetoViaje.setId(id);
                        /*Viaje empleadoViaje */
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
                        System.out.print("-Ingrese el valor total de la alimentacion: $");
                        objetoViaje.setTotalAlimentos(entradaPorTeclado.nextDouble());
                        System.out.print("-Ingrese el valor total del alojamiento: $");
                        objetoViaje.setTotalAlojamiento(entradaPorTeclado.nextDouble());
                        System.out.print("-Ingrese el valor total del transporte: $");
                        objetoViaje.setTotalTranspote(entradaPorTeclado.nextDouble());
                        viajes.add(objetoViaje);
                        empleadoEncontrado.calcularBono(objetoViaje,empleadoEncontrado);
                    }else {
                        System.out.println("El empleado no existe");
                    }
                    break;

                case 3:
                    System.out.println("Lista de empleados: ");
                    for (Empleado empleado: empleados) {
                        System.out.println("Id del empleado: "+empleado.getId()+"\n"+"Nombre del empleado: "+empleado.getNombre() +
                                "\n"+"Apellido del empleado: "+empleado.getApellido()+"\n"+"Edad del empleado: "+empleado.getEdad()+
                                "\n"+"Cargo del empleado: "+empleado.getCargo()+"\n"+"Salario del empleado: $"+empleado.getSalario()+"\n");
                    }
                    break;
                case 4:
                    System.out.print("-Ingrese el documento del empleado: ");
                    id = entradaPorTeclado.next();

                    for (Viaje viaje:viajes) {
                        if (viaje.getId().equals(id)) {
                            System.out.println("-La fecha de ida es: "+ viaje.getFechaIda());
                            System.out.println("-La fecha de regreso es: "+ viaje.getFechaVuelta());
                            System.out.println("-El lugar de origen es: "+ viaje.getOrigen());
                            System.out.println("-El lugar de destino es: "+ viaje.getDestino());
                            System.out.println("-El tipo de viaje es: "+ viaje.getTipoViaje());
                            System.out.println("-El tipo de transporte es: "+ viaje.getTipoTransporte());
                            System.out.println("-El valor del ticket es: $"+ viaje.getValorViaje());
                            System.out.println("-El valor total de la alimentcion fue: "+ viaje.getTotalAlimentos());
                            System.out.println("-El valor del alojamiento fue: "+ viaje.getTotalAlojamiento());
                            System.out.println("-El valor total del transporte fue: "+ viaje.getTotalTranspote()+"\n");

                        }else {
                            System.out.println("El empleado no tiene viajes registrados o no existe");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliste del Viatictech");
                default:
                    System.out.println("Opcion no valida");
            }
        }while (variableDeControl !=0);
    }
}
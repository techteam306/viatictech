package org.example;

import org.example.controladores.Empleado;
import org.example.controladores.Viaje;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        Empleado objetoEmpleado = new Empleado();
        Viaje objetoViaje = new Viaje();

        //Creando menú
        int variableDeControl = 0;
        System.out.println("***** Viatictech *****");
        System.out.println("**********************\n");

        System.out.println("Menu");
        System.out.println("1. Registro de empleado");
        System.out.println("2. Registro de viaje");
        System.out.println("3. Ver empleados");
        System.out.println("4. Ver viajes de un empleado");
        System.out.println("0. Salir\n");

        do{
            System.out.print("Digita una opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();

            switch (variableDeControl){
                case 1:
                    System.out.println("Esta es la opcion 1");
                    break;
                case 2:
                    System.out.println("Esta es la opcion 2");
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
                    System.out.println("Digite una opcion valida");
            }
        }while (variableDeControl !=0);
    }
}
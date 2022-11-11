package org.example.controladores;

import java.util.PrimitiveIterator;

public class Transporte {

    //ATRIBUTOS

    private String tipoTransporte;
    private double valorPasaje;
    private int cantidadDeTransporteTomados;

    //CONSTRUCTOR


    public Transporte() {
    }

    public Transporte(String tipoTransporte, double valorPasaje, int cantidadDeTransporteTomados) {
        this.tipoTransporte = tipoTransporte;
        this.valorPasaje = valorPasaje;
        this.cantidadDeTransporteTomados = cantidadDeTransporteTomados;
    }

    //METODOS


    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getCantidadDeTransporteTomados() {
        return cantidadDeTransporteTomados;
    }

    public void setCantidadDeTransporteTomados(int cantidadDeTransporteTomados) {
        if(cantidadDeTransporteTomados<0){
            System.out.println("Debiste tomar más de un transporte.");
        } else{
            this.cantidadDeTransporteTomados=cantidadDeTransporteTomados;
        }
    }

}

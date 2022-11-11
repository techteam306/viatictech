package org.example.controladores;

public class Alojamiento {
    //ATRIBUTOS

    private  int cantidadNoches;
    private double valorNoche;
    private String tipoHospedaje;

    //CONSTRUCTOR


    public Alojamiento() {
    }

    public Alojamiento(int cantidadNoches, double valorNoche, String tipoHospedaje) {
        this.cantidadNoches = cantidadNoches;
        this.valorNoche = valorNoche;
        this.tipoHospedaje = tipoHospedaje;
    }

    //METODOS


    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        if (cantidadNoches<0){
            System.out.println("Se necesita una cantidad mayor a 0");
        }else  {
            this.cantidadNoches = cantidadNoches;
        }
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(double valorNoche) {
        this.valorNoche = valorNoche;
    }

    public String getTipoHospedaje() {
        return tipoHospedaje;
    }

    public void setTipoHospedaje(String tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

}

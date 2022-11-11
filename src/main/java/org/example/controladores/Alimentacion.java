package org.example.controladores;

public class Alimentacion {
    //ATRIBUTOS

    private  String tipoPlato;
    private double valorPlato;
    private int cantidadPlato;

    //CONSTRUCTORES


    public Alimentacion() {
    }

    public Alimentacion(String tipoPlato, double valorPlato, int cantidadPlato) {
        this.tipoPlato = tipoPlato;
        this.valorPlato = valorPlato;
        this.cantidadPlato = cantidadPlato;
    }

    //METODOS


    public String getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(String tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

    public double getValorPlato() {
        return valorPlato;
    }

    public void setValorPlato(double valorPlato) {
        this.valorPlato = valorPlato;
    }

    public int getCantidadPlato() {
        return cantidadPlato;
    }

    public void setCantidadPlato(int cantidadPlato) {
        if (cantidadPlato<0){
            System.out.println("Se necesita una cantidad mayor a 0");
        }else  {
            this.cantidadPlato = cantidadPlato;
        }
    }

}

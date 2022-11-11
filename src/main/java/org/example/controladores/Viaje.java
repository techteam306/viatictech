package org.example.controladores;

public class Viaje {

    //ATRIBUTOS

    private String fechaIda,fechaVuelta,origen,destino,tipoViaje,tipoTransporte;
    private double valorViaje;

    //CONSTRUCTOR


    public Viaje() {
    }

    public Viaje(String fechaIda, String fechaVuelta, String origen, String destino, String tipoViaje, String tipoTransporte, double valorViaje) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.origen = origen;
        this.destino = destino;
        this.tipoViaje = tipoViaje;
        this.tipoTransporte = tipoTransporte;
        this.valorViaje = valorViaje;
    }

    //METODOS


    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getValorViaje() {
        return valorViaje;
    }

    public void setValorViaje(double valorViaje) {
        this.valorViaje = valorViaje;
    }
}

package org.example.controladores;

public class Viaje {

    //ATRIBUTOS

    private String fechaIda,fechaVuelta,origen,destino,tipoViaje,tipoTransporte,id;
    private double valorViaje, totalAlimentos, totalAlojamiento, totalTranspote;

    //CONSTRUCTOR


    public Viaje() {
    }

    public Viaje(String fechaIda, String fechaVuelta, String origen, String destino, String tipoViaje, String tipoTransporte, String id, double valorViaje, double totalAlimentos, double totalAlojamiento, double totalTranspote) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.origen = origen;
        this.destino = destino;
        this.tipoViaje = tipoViaje;
        this.tipoTransporte = tipoTransporte;
        this.id = id;
        this.valorViaje = valorViaje;
        this.totalAlimentos = totalAlimentos;
        this.totalAlojamiento = totalAlojamiento;
        this.totalTranspote = totalTranspote;
    }

    //METODOS


    public double getTotalAlimentos() {
        return totalAlimentos;
    }

    public void setTotalAlimentos(double totalAlimentos) {
        this.totalAlimentos = totalAlimentos;
    }

    public double getTotalAlojamiento() {
        return totalAlojamiento;
    }

    public void setTotalAlojamiento(double totalAlojamiento) {
        this.totalAlojamiento = totalAlojamiento;
    }

    public double getTotalTranspote() {
        return totalTranspote;
    }

    public void setTotalTranspote(double totalTranspote) {
        this.totalTranspote = totalTranspote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

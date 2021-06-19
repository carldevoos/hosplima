package com.tesis2utp.hosplima.dto;

public class HospitalMapa {

    private String ipress;
    private Double longitud;
    private Double latitud;

    public HospitalMapa() {
    }

    public HospitalMapa(String ipress, Double longitud, Double latitud) {
        this.ipress = ipress;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getIpress() {
        return ipress;
    }

    public void setIpress(String ipress) {
        this.ipress = ipress;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }
}

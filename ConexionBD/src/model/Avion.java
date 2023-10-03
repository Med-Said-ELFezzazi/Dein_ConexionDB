package model;

public class Avion{
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;
    private boolean activado;
    private int idAvion;
    private int idAeropuerto;

    public Avion(int id, String modelo, int nAsientos, double velocidadMaxima, boolean activado, int idAeropuerto) {
        this.idAvion = id;
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.activado = activado;
        this.idAeropuerto = idAeropuerto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean value) {
        this.activado = value;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    @Override
    public String toString() {
        return "Avion [modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + ", activado=" + activado + ", idAvion=" + idAvion + ", idAeropuerto=" + idAeropuerto + "]";
    }
}
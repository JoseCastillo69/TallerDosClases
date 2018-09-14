package com.example.android.tallerdosclase;

public class movil {

    private String marca;
    private int capacidad;
    private String color;
    private double precio;

    public movil(String marca, int capacidad, String color, double precio) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void guardar(){
        datos.guardar(this);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

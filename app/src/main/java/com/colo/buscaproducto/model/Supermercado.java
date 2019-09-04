package com.colo.buscaproducto.model;

public class Supermercado {

    private int id;
    private String nombre;

    //CONSTRUCTOR
    public Supermercado() { }

    //METODOS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}

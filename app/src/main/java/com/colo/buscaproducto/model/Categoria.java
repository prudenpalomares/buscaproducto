package com.colo.buscaproducto.model;

public class Categoria {

    private int id;
    private String nombre;

    //CONSTRUCTOR
    public Categoria() {}

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
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}

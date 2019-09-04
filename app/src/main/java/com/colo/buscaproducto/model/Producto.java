package com.colo.buscaproducto.model;

//Import com.google.gson.annotations.SerializedName;

public class Producto {

    private int id;
    private String nombre;
    private Categoria categoria;

    //CONSTRUCTOR
    public Producto() {    }

    public Producto(int codigo, String nombre, Categoria categoria) {

        this.id = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    //METODOS
    public int getId() { return id; }
    public void setId(int id) { this.id = id;  }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                '}';
    }

}

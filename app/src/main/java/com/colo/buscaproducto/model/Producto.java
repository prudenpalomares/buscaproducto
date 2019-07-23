package com.colo.buscaproducto.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Producto {

    private int idProducto;

    @SerializedName("nombre")
    private String nombreProducto;

    @SerializedName("precio")
    private double precioProducto;

/*    private String descripcion;
    private Date fechaAlta;
    private String categoria;
    private boolean descatalogado;
*/

    public Producto() {  }

//    public Producto(int codigo, String nombre, double precio, String descripcion, Date fechaAlta) {
    public Producto(int codigo, String nombre, double precio) {

        this.idProducto = codigo;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        //this.descripcion = descripcion;
        //this.fechaAlta = fechaAlta;

    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int codigo) {
        this.idProducto = codigo;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public double getPrecio() {
        return precioProducto;
    }

    public void setPrecio(double precio) {
        this.precioProducto = precio;
    }

/*
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isDescatalogado() {
        return descatalogado;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setDescatalogado(boolean descatalogado) {
        this.descatalogado = descatalogado;
    }
*/
}
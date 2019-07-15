package com.colo.buscaproducto.model;

import java.util.Date;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private String descripcion;
    private Date fechaAlta;
    private String categoria;
    private boolean descatalogado;

    public Producto() {  }

    public Producto(int codigo, String nombre, double precio, String descripcion, Date fechaAlta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

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
}
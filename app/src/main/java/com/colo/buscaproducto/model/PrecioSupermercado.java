package com.colo.buscaproducto.model;

//import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class PrecioSupermercado {

    private Producto producto;
    private Supermercado supermercado;
    private Double precio;
    private Date fecha;

    public PrecioSupermercado() {

    }

    public PrecioSupermercado(Producto producto, Supermercado supermercado, double precio, Date fecha) {
        this.producto = producto;
        this.supermercado = supermercado;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getProducto() {
        return producto.getId();
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "PrecioSupermercado{" +
                "producto=" + producto +
                ", supermercado=" + supermercado +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}

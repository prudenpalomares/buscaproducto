package com.colo.buscaproducto.model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private Long id;
    private Date fecha;
    private int mesa;
    //private Camarero camarero;

    private List<LineaPedido> lineasPedido;

    public Pedido() {
    }

   // public Pedido(Long id, Date fecha, int mesa, Camarero camarero, List<LineaPedido> lineasPedido) {
     public Pedido(Long id, Date fecha, int mesa, List<LineaPedido> lineasPedido) {
        this.id = id;
        this.fecha = fecha;
        this.mesa = mesa;
      //  this.camarero = camarero;
        this.lineasPedido = lineasPedido;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

   // public Camarero getCamarero() {
   // return camarero;
   // }

    //public void setCamarero(Camarero camarero) {
    //    this.camarero = camarero;
    //}

    public List<LineaPedido> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(List<LineaPedido> lineasPedido) {
        this.lineasPedido = lineasPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", mesa=" + mesa +
      //          ", camarero=" + camarero +
                ", lineasPedido=" + lineasPedido +
                '}';
    }
}
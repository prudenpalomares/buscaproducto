package com.colo.buscaproducto.services;

import com.colo.buscaproducto.model.PrecioSupermercado;
import com.colo.buscaproducto.model.Producto;

import java.util.List;

public interface PrecioSupermercadoServices {

    // Operaciones CRUD

    public PrecioSupermercado create (PrecioSupermercado precioSupermercado);
    public PrecioSupermercado read(int codigo);
    public PrecioSupermercado update(PrecioSupermercado precioSupermercado);
    public boolean delete(int codigo);


    // Obtención de listas

    public List<PrecioSupermercado> getAll ();
    public List<PrecioSupermercado> getByProducto(Producto producto);

}

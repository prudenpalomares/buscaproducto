package com.colo.buscaproducto.services;

import com.colo.buscaproducto.model.Producto;

import java.util.List;

public interface ProductoServices {

    public Producto create(Producto producto);
    public Producto update(Producto producto);
    public boolean delete(int codigo);

    public Producto read(int id);
    public List<Producto> getAll();

}

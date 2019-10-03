package com.colo.buscaproducto.services.impl;

import com.colo.buscaproducto.model.PrecioSupermercado;
import com.colo.buscaproducto.model.Producto;
import com.colo.buscaproducto.services.PrecioSupermercadoServices;
import com.colo.buscaproducto.sqlite.DatabaseHelper;

import java.util.List;

public class PrecioSupermercadoServicesImpl implements PrecioSupermercadoServices {

    private DatabaseHelper myDB;

    @Override
    public PrecioSupermercado create(PrecioSupermercado precioSupermercado) {
        return null;
    }

    @Override
    public PrecioSupermercado read(int codigo) {
        return null;
    }

    @Override
    public PrecioSupermercado update(PrecioSupermercado precioSupermercado) {
        return null;
    }

    @Override
    public boolean delete(int codigo) {
        return false;
    }

    @Override
    public List<PrecioSupermercado> getAll() {
        return null;
    }

    @Override
    public List<PrecioSupermercado> getByProducto(Producto producto) {
        return null;
    }
}

package com.colo.buscaproducto.services.impl;

import android.content.Context;

import com.colo.buscaproducto.sqlite.DatabaseHelper;
import com.colo.buscaproducto.model.Producto;
import com.colo.buscaproducto.services.ProductoServices;

import java.util.List;

public class ProductoServicesImpl implements ProductoServices {

    private Context contexto;
    private DatabaseHelper myDB;

    public ProductoServicesImpl(Context context){
        this.contexto = context;
        myDB = new DatabaseHelper(contexto);
    }

    @Override
    public List<Producto> getAll() {
        return myDB.getAllProducto();    }

    @Override
    public Producto read(int id) {
        return null;
    }


    @Override
    public Producto create(Producto producto) {
        //return myDB.createProducto(producto);
        return null;
    }

    @Override
    public Producto update(Producto producto) {
        //TODO
        return null;
    }

    @Override
    public boolean delete(int codigo) {
        //TODO
        return false;
    }


}
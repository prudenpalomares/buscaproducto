package com.colo.buscaproducto.services.impl;

import com.colo.buscaproducto.model.Supermercado;
import com.colo.buscaproducto.services.SupermercadoServices;
import com.colo.buscaproducto.sqlite.DatabaseHelper;

import java.util.List;

public class SupermercadoServicesImpl implements SupermercadoServices {

    private DatabaseHelper myDB;

/*
    @Override
    public List<Supermercado> getAll() {
        return myDB.getAllSupermercado();
    }
*/

    @Override
    public Supermercado read(int codigo) {
        return null;
    }

    @Override
    public Supermercado create(Supermercado supermercado) {
        return null;
    }

//    @Override
//    public Supermercado read(int codigo) { return null;  }

    @Override
    public Supermercado update(Supermercado supermercado) {
        return null;
    }

    @Override
    public boolean delete(int codigo) {
        return false;
    }
}

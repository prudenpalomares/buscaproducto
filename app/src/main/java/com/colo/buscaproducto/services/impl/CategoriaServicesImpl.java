package com.colo.buscaproducto.services.impl;

import android.content.Context;

import com.colo.buscaproducto.model.Categoria;
import com.colo.buscaproducto.services.CategoriaServices;
import com.colo.buscaproducto.sqlite.DatabaseHelper;

import java.util.List;

public class CategoriaServicesImpl implements CategoriaServices {

    private Context contexto;
    private DatabaseHelper myDB;

    public CategoriaServicesImpl(Context context){
        this.contexto = context;
        myDB = new DatabaseHelper(contexto);
    }

    @Override
    public List<Categoria> getAll() {
        return myDB.getAllCategoria();    }

    @Override
    public Categoria read(int id) {
        return null;
    }


}
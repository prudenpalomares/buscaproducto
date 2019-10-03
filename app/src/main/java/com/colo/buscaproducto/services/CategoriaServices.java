package com.colo.buscaproducto.services;

import com.colo.buscaproducto.model.Categoria;

import java.util.List;

public interface CategoriaServices {

    public List<Categoria> getAll();        // devuelve todas las categorías
    public Categoria read(int id);          // devuelve categoría por id

}

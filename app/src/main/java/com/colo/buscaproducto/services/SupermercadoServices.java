package com.colo.buscaproducto.services;

import com.colo.buscaproducto.model.Supermercado;

public interface SupermercadoServices {

    // Devuelve el Supermercado que hemos creado, con la id que le ha otorgado el sistema
    public Supermercado create(Supermercado supermercado);

    public Supermercado read (int codigo);

    // Le pasamos un Supermercado con id! (uno ya existente) pero con datos actualizados
    public Supermercado update(Supermercado supermercado);

    // Devuelve mediante un boolean la información de que la eliminación se ha hecho efectiva
    public boolean delete(int codigo);

}

package com.colo.buscaproducto.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;
import android.widget.TextView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.adapters.CategoriaAdapter;
import com.colo.buscaproducto.model.Categoria;
import com.colo.buscaproducto.services.CategoriaServices;
import com.colo.buscaproducto.services.impl.CategoriaServicesImpl;

import java.util.List;

public class ListadoCategoriasActivity extends AppCompatActivity {

    private CategoriaServices categoriaServices;
    private TextView textCategoria, textNombreCategoria;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_categorias);

        categoriaServices = new CategoriaServicesImpl(this);
        List<Categoria> categorias = categoriaServices.getAll();

        //textCategoria = (TextView) findViewById(R.id.idCategoria);
        //textNombreCategoria = (TextView) findViewById(R.id.idNombreCategoria);
        listView = (ListView) findViewById(R.id.idListadoCategorias);

        CategoriaAdapter categoriaAdaptador = new CategoriaAdapter(this, categorias);
        listView.setAdapter(categoriaAdaptador);

    }

}

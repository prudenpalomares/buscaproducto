package com.colo.buscaproducto.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.adapters.ProductoAdapter;
import com.colo.buscaproducto.model.Categoria;
import com.colo.buscaproducto.model.Producto;
import com.colo.buscaproducto.services.ProductoServices;
import com.colo.buscaproducto.services.impl.ProductoServicesImpl;

import java.util.List;

public class ListadoProductosActivity extends AppCompatActivity {

    private ProductoServices productoServices;
    private TextView textProducto, textNombreProducto;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_productos);

        productoServices = new ProductoServicesImpl(this);
        //Log.d("*** productoServices", productoServices.toString());

        List<Producto> productos = productoServices.getAll();
        listView = (ListView) findViewById(R.id.idListadoProductos);
        ProductoAdapter productoAdaptador = new ProductoAdapter(this, productos);
        listView.setAdapter(productoAdaptador);
    }

    public void enviar(View view){
        Log.d("*******","entramos en enviar");

      //  EditText editId = (EditText) findViewById(R.id.idProducto);
      //  EditText editNombre = (EditText) findViewById(R.id.idNombreProducto);
        //EditText editCategoria = (EditText) findViewById(R.id.idCategoriaProducto);

      //  Integer codigo = Integer.parseInt(editId.getText().toString());
      //  String nombre = editNombre.getText().toString();
        Categoria categoria = null;

      //  Producto producto = new Producto(codigo, nombre, categoria);       //instanciar productor
      //  productoServices.create(producto);       // persistir el producto

        Intent intent = new Intent(this, MainActivity.class); //instanciar intent
        startActivity(intent);  // cambiar activity

    }


}

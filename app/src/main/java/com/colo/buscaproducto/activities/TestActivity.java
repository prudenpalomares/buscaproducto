package com.colo.buscaproducto.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.adapters.ProductoAdapter;
import com.colo.buscaproducto.model.Categoria;
import com.colo.buscaproducto.model.Producto;
import com.colo.buscaproducto.sqlite.DatabaseHelper;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;

    private Button crearCategorias;
    private Button mostrarCategorias;
    private Button crearProductos;
    private Button mostrarProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        databaseHelper = new DatabaseHelper(this);

        // Necesitamos los botones...

        crearCategorias = (Button) findViewById(R.id.crearCategoriasButton);
        mostrarCategorias = (Button) findViewById(R.id.mostrarCategoriasButton);
        crearProductos = (Button) findViewById(R.id.crearProductosButton);
        mostrarProductos = (Button) findViewById(R.id.mostrarProductosButton);

        crearCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearCategoria();
                crearCategoria();
                crearCategoria();
                crearCategoria();
            }
        });

        mostrarCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCategorias();
            }
        });

        crearProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //Log.d("*test","crearProductos");
                crearProducto();
                crearProducto();
                crearProducto();
                crearProducto();
            }
        });

        mostrarProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarProductos();
            }
        });

    }


    // **************************************************************************
    // Métodos privados de la activity...
    // **************************************************************************

    private void crearCategoria(){

        int numeroAleatorio = (int)(Math.random() * 1000000);
        Categoria categoria = new Categoria(0, "CATEGORIA_" + numeroAleatorio);

        // La guardamos en la DB

        this.databaseHelper.crearCategoria(categoria);

    }

    private void mostrarCategorias(){

        List<Categoria> categorias = databaseHelper.getAllCategoria();

        for(Categoria categoria: categorias){
            Log.d("*test",categoria.toString());
        }

        Log.d("*******","entramos en listado_categorias");

        Intent intent = new Intent(this, ListadoCategoriasActivity.class); //instanciar intent
        startActivity(intent);  // cambiar activity

    }

    private void crearProducto(){

        int numeroAleatorio = (int)(Math.random() * 1000000);

        // TODO Buscar en la base de datos una categoria que exista y colocarla aquí....!
        Categoria categoria = new Categoria(666,"Nombre");

        Producto producto = new Producto(0, "PRODUCTO_" + numeroAleatorio, categoria);

        // La guardamos en la DB

        this.databaseHelper.crearProducto(producto);

    }

    private void mostrarProductos(){

        List<Producto> productos = databaseHelper.getAllProducto();
        for(Producto producto: productos){
            Log.d("*test",producto.toString());
        }

        Log.d("*******","entramos en listado_productos");

        Intent intent = new Intent(this, ListadoProductosActivity.class); //instanciar intent
        startActivity(intent);  // cambiar activity

    }

}

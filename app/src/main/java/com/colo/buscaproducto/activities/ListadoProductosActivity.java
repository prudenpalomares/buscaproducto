package com.colo.buscaproducto.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.model.Producto;
import com.colo.buscaproducto.retrofit.JsonPlaceHolderApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ListadoProductosActivity extends AppCompatActivity {

    private TextView textViewResult;
    private TextView textProducto;
    private TextView textNombreProducto;
    private TextView textCategoria;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos);

        textViewResult = (TextView) findViewById(R.id.idTextViewProductos);
        textProducto = (TextView) findViewById(R.id.idProducto);
        textNombreProducto = (TextView) findViewById(R.id.idNombreProducto);
        textCategoria = (TextView) findViewById(R.id.idCategoriaProducto);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pedi-gest.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Producto>> call = jsonPlaceHolderApi.getAll();

        call.enqueue(new Callback<List<Producto>>() {

            @Override
            public void onResponse(Call<List<Producto>> call, Response<List<Producto>> response) {

                if (!response.isSuccessful()){
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Producto> productos = response.body();

                for(Producto producto: productos){
                    /*String content = "\n\n";
                    content += "ID: " + producto.getIdProducto() + "\n";
                    content += "Nombre: " + producto.getNombre() + "\n\n";
                    */

                    String content = Integer.toString(producto.getId());
                    //textViewResult.append(content);
                    textProducto.append(content);
                    textNombreProducto.append(producto.getNombre());
       //error de tipo             //textCategoria.append(producto.getCategoria());

                }

            }
            @Override
            public void onFailure(Call<List<Producto>> call, Throwable t) {

            }
        });

    }
}

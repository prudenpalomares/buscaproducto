package com.colo.buscaproducto.retrofit;

import com.colo.buscaproducto.model.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @GET("productos")
    public Call<List<Producto>> getAll();

    @Headers("Content-type: application/json")
    @POST("productos")
    public Call<Producto> create(@Body Producto producto);

}
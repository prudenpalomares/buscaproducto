package com.colo.buscaproducto.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.colo.buscaproducto.model.Categoria;
import com.colo.buscaproducto.model.Producto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "buscarproductos.db";

    public static final String CATEGORIAS_TABLE = "CATEGORIAS";
    public static final String CATEGORIAS_COL_0 = "ID";
    public static final String CATEGORIAS_COL_1 = "NOMBRE";

    public static final String PRODUCTOS_TABLE = "PRODUCTOS";
    public static final String PRODUCTOS_COL_0 = "ID";
    public static final String PRODUCTOS_COL_1 = "NOMBRE";
    public static final String PRODUCTOS_COL_2 = "IDCATEGORIA";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.d("****","ENTRAMOS EN ONCREATE!");

        StringBuilder strSQL = new StringBuilder();

        strSQL.append ("CREATE TABLE ")
                .append(CATEGORIAS_TABLE).append(" (")
                .append(CATEGORIAS_COL_0).append(" INTEGER PRIMARY KEY AUTOINCREMENT,")
                .append(CATEGORIAS_COL_1).append(" TEXT NOT NULL)");

        db.execSQL(strSQL.toString());

        strSQL = new StringBuilder();

        strSQL.append ("CREATE TABLE ")
                .append(PRODUCTOS_TABLE).append(" (")
                .append(PRODUCTOS_COL_0).append(" INTEGER PRIMARY KEY AUTOINCREMENT,")
                .append(PRODUCTOS_COL_1).append(" TEXT NOT NULL,")
                .append(PRODUCTOS_COL_2).append(" INTEGER NOT NULL)");

        db.execSQL(strSQL.toString());
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.d("****","ENTRAMOS EN ONUPGRADE!");

        onCreate(db);
    }

    // ***************************************************************************
    // Métodos propios
    // ***************************************************************************

    public void crearCategoria(Categoria categoria){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CATEGORIAS_COL_1, categoria.getNombre());
        db.insert(CATEGORIAS_TABLE, null, contentValues);
        db.close();
    }

    public void crearProducto(Producto producto){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PRODUCTOS_COL_1, producto.getNombre());
        contentValues.put(PRODUCTOS_COL_2, producto.getCategoria().getId());
        db.insert(PRODUCTOS_TABLE, null, contentValues);
        db.close();
    }

    public Categoria readCategoria(int codigo){
        //TODO EL SIGUIENTE TODO A RESOLVER
        return null;
    }

    public Producto readProducto(Producto producto){
        //TODO
        return producto;
    }

    public List<Categoria> getAllCategoria(){

        List<Categoria> categorias = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();

        // TODO hacer bonito y bien a partir de los nombres de las columnas

        String strSQL = "SELECT * FROM CATEGORIAS";

        Cursor cursor = db.rawQuery(strSQL,null);

        while(cursor.moveToNext()) {

            Categoria categoria = new Categoria();

            categoria.setId(cursor.getInt(0));
            categoria.setNombre(cursor.getString(1));

            // Esa categoria la "metemos en el saco"

            categorias.add(categoria);
        }

        return categorias;
    }


    public List<Producto> getAllProducto(){

        List<Producto> productos = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();

        // TODO hacer bonito y bien a partir de los nombres de las columnas

        String strSQL = "SELECT * FROM PRODUCTOS";

        Cursor cursor = db.rawQuery(strSQL,null);

        while(cursor.moveToNext()) {

            Producto producto = new Producto();

            producto.setId(cursor.getInt(0));
            producto.setNombre(cursor.getString(1));

            // Conocemos el código de la categoría, pero ese código NO se lo podemos asignar al producto

            int codigoCategoria = cursor.getInt(2);

            // Tengo que recuperar la Categoria de la DB

            Categoria categoria = readCategoria(codigoCategoria);

            producto.setCategoria(categoria);
            productos.add(producto);
        }

        return productos;
    }

}


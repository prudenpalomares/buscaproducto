package com.colo.buscaproducto.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.colo.buscaproducto.model.Categoria;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "buscaproducto.db";
    public static final String PRODUCTOS_TABLE = "PRODUCTOS";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NOMBRE";
    public static final String COL_3 = "CATEGORIA";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Entramos en este metodo cuando la base de datos se crea por primera vez.
        // Se tendra que ejecutar una sentencia de DDL (Data Definition Lanquage)

        StringBuilder strSQL = new StringBuilder();
        //CREATE TABLE AMIGOS(ID INTEGER PRIMARY KEY AUTOINCREMENT,NOMBRE TEXT NOT NULL,APELLIDO1 TEXT NOT NULL, APELLIDO2 TEXT NOT NULL)

        strSQL.append ("CREATE TABLE ")
                .append(PRODUCTOS_TABLE).append(" (")
                .append(COL_1).append(" INTEGER PRIMARY KEY AUTOINCREMENT,")
                .append(COL_2).append(" TEXT NOT NULL,")
                .append(COL_3).append(" TEXT NOT NULL,");

        //Log.d("*******", strSQL.toString());

        db.execSQL(strSQL.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + PRODUCTOS_TABLE);
        onCreate(db);
    }

    //metodos crud

    public boolean insertData( String nombre, String apellido1, Categoria categoria){

        SQLiteDatabase db = getWritableDatabase();

        ContentValues contentValues  = new ContentValues();
        contentValues.put(COL_2, nombre);
        //contentValues.put(COL_3, categoria);


        long resultado = db.insert(PRODUCTOS_TABLE, null, contentValues);

        //String nombreBaseDatos = this.getDatabaseName();
        //nombreBaseDatos = this.DATABASE_NAME;
        //nombreBaseDatos = DatabaseHelper.DATABASE_NAME;

        return resultado == -1 ? false : true;
    }

    public Cursor getAll(){

        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + PRODUCTOS_TABLE, null);

        return cursor;
    }

}


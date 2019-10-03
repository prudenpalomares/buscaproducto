package com.colo.buscaproducto.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.model.Producto;

import java.util.List;

public class ProductoAdapter extends BaseAdapter {

    private LayoutInflater inflater = null;
    private List<Producto> productos;
    private Context contexto = null;

    public ProductoAdapter(Context contexto, List<Producto> productos){
        this.contexto = contexto;
        this.productos = productos;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);

        //ProductoServices productoServices = new ProductoServicesImpl(contexto);
        //productos = productoServices.getAll();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.producto_row, null);

        TextView codigo = (TextView) vista.findViewById(R.id.idCodigoProducto);
        TextView nombre = (TextView) vista.findViewById(R.id.idNombreProducto);
        //TextView categoria = (TextView) vista.findViewById(R.id.idCodigoCategoria);

        Producto producto = productos.get(position);
        nombre.setText(String.valueOf(producto.getNombre()));
        codigo.setText(String.valueOf(producto.getId()));
        //categoria.setText(String.valueOf(producto.getIdCategoria()));

        return vista;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int position) {
        return productos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return productos.get(position).getId();
    }

}

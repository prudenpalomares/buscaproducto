package com.colo.buscaproducto.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.colo.buscaproducto.R;
import com.colo.buscaproducto.model.Categoria;

import java.util.List;

public class CategoriaAdapter extends BaseAdapter {

    private LayoutInflater inflater = null;
    private List<Categoria> categorias = null;
    private Context contexto = null;

    public CategoriaAdapter(Context contexto, List<Categoria> categorias){
        this.contexto = contexto;
        this.categorias = categorias;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.categoria_row, null);

        TextView codigo = (TextView) vista.findViewById(R.id.idCodigoCategoria);
        TextView nombre = (TextView) vista.findViewById(R.id.idNombreCategoria);

        Categoria categoria = categorias.get(position);

        codigo.setText(String.valueOf(categoria.getId()));
        nombre.setText(categoria.getNombre());

        return vista;
    }

    @Override
    public int getCount() {
        return categorias.size();
    }

    @Override
    public Object getItem(int position) {
        return categorias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return categorias.get(position).getId();
    }

}

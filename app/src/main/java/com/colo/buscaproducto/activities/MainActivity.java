package com.colo.buscaproducto.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.colo.buscaproducto.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = null;
        intent = new Intent(this, ListadoProductosActivity.class);

        startActivity(intent);

    }
}

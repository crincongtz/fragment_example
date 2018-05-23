package com.crincongtz.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.crincongtz.fragments.DetalleFragment;

/**
 * Created by crincongtz on 16/05/18.
 */

public class DetalleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        DetalleFragment fragment = new DetalleFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_detalle, fragment)
                .commit();

    }
}

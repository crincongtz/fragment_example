package com.crincongtz.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crincongtz.fragments.DetalleFragment;
import com.crincongtz.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    public static boolean isTablet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentMain);

        DetalleFragment detalleFragment = (DetalleFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentDetalle);

        isTablet = detalleFragment != null;
        if (isTablet){
            mainFragment.setListener(detalleFragment);
        }


    }
}

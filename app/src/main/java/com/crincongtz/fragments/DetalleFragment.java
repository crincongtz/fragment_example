package com.crincongtz.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crincongtz.fragmentexample.R;
import com.crincongtz.interfaces.NameListener;

/**
 * Created by crincongtz on 16/05/18.
 */

public class DetalleFragment extends Fragment implements NameListener {

    private String data;
    private TextView description;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getActivity().getIntent().getStringExtra("nombre");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        description = view.findViewById(R.id.textView);
        description.setText(data);

        return view;
    }

    @Override
    public void sendName(String name) {
        description.setText(name);
    }
}

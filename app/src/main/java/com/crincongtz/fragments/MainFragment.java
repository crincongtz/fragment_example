package com.crincongtz.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.crincongtz.fragmentexample.DetalleActivity;
import com.crincongtz.fragmentexample.MainActivity;
import com.crincongtz.fragmentexample.R;
import com.crincongtz.interfaces.NameListener;

/**
 * Created by crincongtz on 16/05/18.
 */

public class MainFragment extends Fragment {

    private ListView listItems;
    private NameListener listener;
    private String[] staticData = {
            "item 1",
            "item 2",
            "item 3",
            "item 4",
            "item 5",
            "item 6",
            "item 7",
            "item 8",
            "item 9",
            "item 10",
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_activity, container, false);

        listItems = view.findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, staticData);
        listItems.setAdapter(adapter);
        listItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (MainActivity.isTablet){
                    if (listener != null){
                        listener.sendName(staticData[position]);
                    }
                } else {
                    Intent intent = new Intent(getContext(), DetalleActivity.class);
                    intent.putExtra("nombre", staticData[position]);
                    startActivity(intent);
                }
            }
        });


        return view;
    }

    public void setListener(NameListener listener) {
        this.listener = listener;
    }
}

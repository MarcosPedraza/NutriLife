package com.kike.nutri.nutrilife;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kike.nutri.nutrilife.Adapters.AdapterEjercicios;
import com.kike.nutri.nutrilife.Models.Ejercicio;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RutinasFragment extends Fragment {


    //widgets
    RecyclerView rv_ejercicos;

    //var
    ArrayList<Ejercicio> list_ejer;

    public RutinasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rutinas, container, false);
        rv_ejercicos = view.findViewById(R.id.rv_rutinas);

        loadData();
        AdapterEjercicios adapter = new AdapterEjercicios(list_ejer, getContext());
        rv_ejercicos.setAdapter(adapter);
        rv_ejercicos.setLayoutManager(new LinearLayoutManager(getContext()));

        return  view;

    }

    private void loadData() {
        list_ejer = new ArrayList<>();
        list_ejer.add(new Ejercicio("Rutina intensa para abdomen perfecto","c_XOTJJXfVQ","https://i.ytimg.com/an_webp/c_XOTJJXfVQ/mqdefault_6s.webp?du=3000&sqp=CMDBvN4F&rs=AOn4CLDGSESGTjck2yYlCLxGogWtePhJEg"));
        list_ejer.add(new Ejercicio("Rutina intensa para abdomen perfecto","c_XOTJJXfVQ","https://i.ytimg.com/an_webp/c_XOTJJXfVQ/mqdefault_6s.webp?du=3000&sqp=CMDBvN4F&rs=AOn4CLDGSESGTjck2yYlCLxGogWtePhJEg"));
        list_ejer.add(new Ejercicio("Rutina intensa para abdomen perfecto","c_XOTJJXfVQ","https://i.ytimg.com/an_webp/c_XOTJJXfVQ/mqdefault_6s.webp?du=3000&sqp=CMDBvN4F&rs=AOn4CLDGSESGTjck2yYlCLxGogWtePhJEg"));
        list_ejer.add(new Ejercicio("Rutina intensa para abdomen perfecto","c_XOTJJXfVQ","https://i.ytimg.com/an_webp/c_XOTJJXfVQ/mqdefault_6s.webp?du=3000&sqp=CMDBvN4F&rs=AOn4CLDGSESGTjck2yYlCLxGogWtePhJEg"));
        list_ejer.add(new Ejercicio("Rutina intensa para abdomen perfecto","c_XOTJJXfVQ","https://i.ytimg.com/an_webp/c_XOTJJXfVQ/mqdefault_6s.webp?du=3000&sqp=CMDBvN4F&rs=AOn4CLDGSESGTjck2yYlCLxGogWtePhJEg"));
    }

}

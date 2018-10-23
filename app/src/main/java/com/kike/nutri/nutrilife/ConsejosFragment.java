package com.kike.nutri.nutrilife;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kike.nutri.nutrilife.Adapters.AdapterConsejos;
import com.kike.nutri.nutrilife.Adapters.RecetasAdapter;
import com.kike.nutri.nutrilife.Models.Consejo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConsejosFragment extends Fragment {


    //widgets
    RecyclerView rv_consejos;


    //var
    ArrayList<Consejo> consejos;

    public ConsejosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_consejos, container, false);

        rv_consejos = view.findViewById(R.id.rv_consejos);
        rv_consejos.setHasFixedSize(true);

        loadData();
        AdapterConsejos adapter = new AdapterConsejos(consejos,getContext());
        rv_consejos.setAdapter(adapter);
        rv_consejos.setLayoutManager(new LinearLayoutManager(getContext()));


        return  view;
    }

    private void loadData() {

        consejos = new ArrayList<>();
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
        consejos.add(new Consejo("Compartí la información confiable y la opinión de los especialistas más prestigiosos con este link: 10 consejos para una alimentación saludable ","https://www.buenoyvegano.com/wp-content/uploads/2017/11/medium_PufK7Rj5Mi.jpg"));
    }


}

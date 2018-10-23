package com.kike.nutri.nutrilife;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kike.nutri.nutrilife.Adapters.RecetasAdapter;
import com.kike.nutri.nutrilife.Models.DiaReceta;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResPersFragment extends Fragment {

    private static final String TAG = "ResPersFragment";


    //widget
    RecyclerView rv_dias;

    //variables
    ArrayList<DiaReceta> list_days;


    public ResPersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_res_pers, container, false);

        loadData();
        rv_dias = view.findViewById(R.id.rv_res_personales);
        RecetasAdapter adapter = new RecetasAdapter(list_days, getContext());
        rv_dias.setAdapter(adapter);
        rv_dias.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    public void  loadData()
    {
        list_days = new ArrayList<>();
        list_days.add(new DiaReceta("lun","Lunes",R.drawable.icon_lettuce));
        list_days.add(new DiaReceta("mar","Martes",R.drawable.icon_paella));
        list_days.add(new DiaReceta("mier","Miercoles",R.drawable.icon_wrap));
        list_days.add(new DiaReceta("jue","Jueves",R.drawable.icons_vegan_f));
        list_days.add(new DiaReceta("vie","Viernes",R.drawable.icon_porridge));
        list_days.add(new DiaReceta("sab","Sabado",R.drawable.icons_tapas));
        list_days.add(new DiaReceta("dom","Domingo",R.drawable.icon_eggs));
    }

}

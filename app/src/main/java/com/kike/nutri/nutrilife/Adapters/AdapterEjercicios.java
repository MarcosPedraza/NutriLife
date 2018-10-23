package com.kike.nutri.nutrilife.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kike.nutri.nutrilife.Models.Ejercicio;
import com.kike.nutri.nutrilife.R;

import java.util.ArrayList;

public class AdapterEjercicios extends RecyclerView.Adapter<AdapterEjercicios.ViewHolder>{


    ArrayList<Ejercicio> list_ejercicio;
    Context context;

    public AdapterEjercicios(ArrayList<Ejercicio> list_ejercicio, Context context) {
        this.list_ejercicio = list_ejercicio;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ejercicio,parent,false);
        AdapterEjercicios.ViewHolder holder = new AdapterEjercicios.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre_ejer.setText(list_ejercicio.get(position).getNombre_ejercicio());
        Glide.with(context)
                .load(list_ejercicio.get(position).getUrl_img())
                .into(holder.imag_video);
    }

    @Override
    public int getItemCount() {
        return list_ejercicio.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView nombre_ejer;
        ImageView imag_video;
        public ViewHolder(View itemView) {
            super(itemView);
            nombre_ejer = itemView.findViewById(R.id.tv_nom_ejercicio);
            imag_video = itemView.findViewById(R.id.img_ejercicio);

        }

    }

}

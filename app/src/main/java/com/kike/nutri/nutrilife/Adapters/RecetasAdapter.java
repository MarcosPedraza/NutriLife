package com.kike.nutri.nutrilife.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kike.nutri.nutrilife.Models.DiaReceta;
import com.kike.nutri.nutrilife.R;

import java.util.ArrayList;

public class RecetasAdapter extends RecyclerView.Adapter<RecetasAdapter.ViewHolder> {


    ArrayList<DiaReceta> list_day;
    Context context;

    public  RecetasAdapter(ArrayList<DiaReceta> list_dias, Context context)
    {
        this.list_day = list_dias;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_receta,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.tvDia.setText("Receta para el dia "+list_day.get(position).getNombre_dia());
        holder.iv_dia.setImageResource(list_day.get(position).getImg_resource());
        holder.rootItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(context,)
                Toast.makeText(context, "Click en dia" + list_day.get(position).getNombre_dia(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_day.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        CardView rootItem;
        TextView tvDia;
        ImageView iv_dia;
        public ViewHolder(View itemView) {
            super(itemView);
            rootItem = itemView.findViewById(R.id.card_receta);
            tvDia = itemView.findViewById(R.id.tv_dia);
            iv_dia = itemView.findViewById(R.id.ima_receta);
        }
    }
}

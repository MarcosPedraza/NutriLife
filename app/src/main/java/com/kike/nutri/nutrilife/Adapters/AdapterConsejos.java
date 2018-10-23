package com.kike.nutri.nutrilife.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.kike.nutri.nutrilife.Models.Consejo;
import com.kike.nutri.nutrilife.Models.DiaReceta;
import com.kike.nutri.nutrilife.R;

import java.util.ArrayList;

public class AdapterConsejos extends RecyclerView.Adapter<AdapterConsejos.ViewHolder> {

    ArrayList<Consejo> list_consejo;
    Context context;

    public  AdapterConsejos(ArrayList<Consejo> list_consejos, Context context)
    {
        this.list_consejo = list_consejos;
        this.context = context;
    }


    @NonNull
    @Override
    public AdapterConsejos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_consejo,parent,false);
        AdapterConsejos.ViewHolder holder = new AdapterConsejos.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterConsejos.ViewHolder holder, final int position) {
        holder.tv_consejo.setText(list_consejo.get(position).getConsejo());
        Glide.with(context)
                .load(list_consejo.get(position).getUrl_img())
                .into(holder.iv_consejo);

    }

    @Override
    public int getItemCount() {
        return list_consejo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv_consejo;
        ImageView iv_consejo;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_consejo = itemView.findViewById(R.id.tv_consejo);
            iv_consejo = itemView.findViewById(R.id.img_consejo);
        }
    }
}

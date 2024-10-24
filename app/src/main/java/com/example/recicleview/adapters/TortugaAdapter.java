package com.example.recicleview.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recicleview.R;
import com.example.recicleview.Models.Tortuga;

import java.util.List;

public class TortugaAdapter extends RecyclerView.Adapter<TortugaAdapter.TortugaHolder> {

    List<Tortuga> ListasTortuga;

    public TortugaAdapter(List<Tortuga> listasTortuga) {
        ListasTortuga = listasTortuga;
    }

    @NonNull
    @Override
    public TortugaAdapter.TortugaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View vistatortuga = ly.inflate(R.layout.itemtortuga, parent, false);
        return new TortugaHolder (vistatortuga);
    }

    @Override
    public void onBindViewHolder(@NonNull TortugaAdapter.TortugaHolder holder, int position) {
        holder.setData(ListasTortuga.get(position));

    }

    @Override
    public int getItemCount() {
        return ListasTortuga.size();
    }

    public class TortugaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtNombre, TxtArma, txtDescripcion;
        ImageView imgTortuga;
        Context context;

        Tortuga tortuga;

        public TortugaHolder(@NonNull View itemView) {
            super(itemView);


            txtNombre = itemView.findViewById(R.id.txtNombre);
            TxtArma = itemView.findViewById(R.id.txtArma);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            imgTortuga = itemView.findViewById(R.id.imgTortuga);
            txtNombre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), MainActivity2.class);
                    intent.putExtra("tortuga", tortuga);
                    context.startActivity(intent);
                }
            });
        }

        public void setData(Tortuga tortuga) {
            this.tortuga=tortuga;
            txtNombre.setText(tortuga.getNombre());
            TxtArma.setText(tortuga.getArma());
            txtDescripcion.setText(tortuga.getDescripcion());
        }

        @Override
        public void onClick(View view) {


        }
    }
}

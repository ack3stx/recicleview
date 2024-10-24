package com.example.recicleview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recicleview.Models.Tortuga;
import com.example.recicleview.adapters.TortugaAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclertortuga;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclertortuga=findViewById(R.id.recyclertortuga);


        List<Tortuga> tortugas = new ArrayList<>();

        tortugas.add(new Tortuga("Leonardo", "Es azul y tiene disiplina", "espada", Color.parseColor("#a52e2e"),R.drawable.img ));
        tortugas.add(new Tortuga("Rafael", "Es rojo y es muy fuerte", "sai", Color.parseColor("f72828"),R.drawable.img_1 ));
        tortugas.add(new Tortuga("Miguel Angel", "Es naranja y es muy creativo", "nunchaku", Color.parseColor("#f7a728"),R.drawable.img_2 ));
        tortugas.add(new Tortuga("Donatelo", "Es morado y es muy inteligente", "baston", Color.parseColor("#4ddbb6"),R.drawable.img_3 ));

        TortugaAdapter  adapterTortuga = new TortugaAdapter(tortugas);

        recyclertortuga.setAdapter(adapterTortuga);
        recyclertortuga.setHasFixedSize(true);
        recyclertortuga.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        }
    }

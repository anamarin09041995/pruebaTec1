package com.example.anamarin.pruebatec1;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anamarin.pruebatec1.databinding.ActivityDetalleCitaBinding;
import com.example.anamarin.pruebatec1.models.CitasMedicas;
import com.example.anamarin.pruebatec1.util.Data;
import com.squareup.picasso.Picasso;

public class DetalleCitaActivity extends AppCompatActivity {

    ActivityDetalleCitaBinding binding;
    int pos;
    CitasMedicas cita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cita);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detalle_cita);

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pos = getIntent().getExtras().getInt("pos");
        cita = Data.citas.get(pos);
        binding.setCita(cita);

        Picasso.with(this).load(Uri.parse(cita.getFoto())).into(binding.img);

    }
}

package com.example.anamarin.pruebatec1.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.anamarin.pruebatec1.App;
import com.example.anamarin.pruebatec1.DetalleCitaActivity;
import com.example.anamarin.pruebatec1.R;
import com.example.anamarin.pruebatec1.adapters.CitasMedicasAdapter;
import com.example.anamarin.pruebatec1.databinding.FragmentCitasMedicasBinding;
import com.example.anamarin.pruebatec1.models.CitasMedicas;
import com.example.anamarin.pruebatec1.net.CitasMedicasClient;
import com.example.anamarin.pruebatec1.util.Data;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class CitasMedicasFragment extends Fragment implements CitasMedicasAdapter.onCitaListener {

    FragmentCitasMedicasBinding binding;
    CitasMedicasAdapter adapter;
    CitasMedicasClient client;


    public static CitasMedicasFragment instance(){
        return new CitasMedicasFragment();
    }

    public CitasMedicasFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_citas_medicas, container, false);
        adapter = new CitasMedicasAdapter(getLayoutInflater(null), new ArrayList<CitasMedicas>() , this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        client = App.retrofit.create(CitasMedicasClient.class);

        return binding.getRoot();

    }

    @Override
    public void onResume(){
        super.onResume();
        loadCitas();

    }

    private void loadCitas(){
        int id = 1;
        Call<List<CitasMedicas>> request = client.all(id);
        request.enqueue(new Callback<List<CitasMedicas>>() {
            @Override
            public void onResponse(Call<List<CitasMedicas>> call, Response<List<CitasMedicas>> response) {
                if(response.isSuccessful()){
                    Data.citas = response.body();
                    adapter.setData(Data.citas);
                }
            }
            @Override
            public void onFailure(Call<List<CitasMedicas>> call, Throwable t) {
                Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCitaClick(int position) {
        Intent intent = new Intent(getActivity(), DetalleCitaActivity.class);
        intent.putExtra("pos", position);
        startActivity(intent);
    }
}

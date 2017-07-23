package com.example.anamarin.pruebatec1.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.example.anamarin.pruebatec1.databinding.TemplateCitaMedicaBinding;
import com.example.anamarin.pruebatec1.databinding.TemplateNuevaCitaBinding;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class NuevaCitaAdapter {

    public interface onNuevaCitaListener{
        void onNuevaCitaClick ();
    }

    LayoutInflater inflater;
    NuevaCitaAdapter.onNuevaCitaListener listener;

    public NuevaCitaAdapter(LayoutInflater inflater, NuevaCitaAdapter.onNuevaCitaListener listener){
        this.inflater = inflater;
        this.listener = listener;
    }

    public void agregarCita(){
        listener.onNuevaCitaClick();
    }

    static class NuevaCitaHolder extends RecyclerView.ViewHolder{

        TemplateNuevaCitaBinding binding;

        public NuevaCitaHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

    }
}

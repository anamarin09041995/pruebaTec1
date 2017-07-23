package com.example.anamarin.pruebatec1.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anamarin.pruebatec1.R;
import com.example.anamarin.pruebatec1.databinding.TemplateCitaMedicaBinding;
import com.example.anamarin.pruebatec1.models.CitasMedicas;

import java.util.List;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class CitasMedicasAdapter extends RecyclerView.Adapter<CitasMedicasAdapter.CitasMedicasHolder> {

    public interface onCitaListener{
        void onCitaClick (int position);
    }

    LayoutInflater inflater;
    List<CitasMedicas> data;
    onCitaListener listener;

    public CitasMedicasAdapter(LayoutInflater inflater, List<CitasMedicas> data, onCitaListener listener){
        this.inflater = inflater;
        this.listener = listener;
        this.data = data;
    }


    @Override
    public CitasMedicasHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_cita_medica, parent, false);
        return new CitasMedicasHolder(v);
    }

    @Override
    public void onBindViewHolder(CitasMedicasHolder holder, int position) {
        holder.binding.setCita(data.get(position));
        holder.binding.card.setTag(position);
        holder.binding.setHandler(this);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        listener.onCitaClick(position);
    }

    public void setData(List<CitasMedicas> data){
        this.data = data;
        notifyDataSetChanged();
    }


    //region Cita Medica Holder
    static class CitasMedicasHolder extends RecyclerView.ViewHolder{

        TemplateCitaMedicaBinding binding;

        public CitasMedicasHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

    }
    //endregion
}

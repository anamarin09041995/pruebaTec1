package com.example.anamarin.pruebatec1.net;

import com.example.anamarin.pruebatec1.models.CitasMedicas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public interface CitasMedicasClient {

    @GET("citas")
    Call<List<CitasMedicas>> all();

}

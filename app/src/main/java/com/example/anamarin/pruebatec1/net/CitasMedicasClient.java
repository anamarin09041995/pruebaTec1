package com.example.anamarin.pruebatec1.net;

import com.example.anamarin.pruebatec1.models.CitasMedicas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public interface CitasMedicasClient {

    @POST("citas")
    Call<SimpleResponse>  addCita(@Body CitasMedicas cita);

    @GET("citas/{id}")
    Call<List<CitasMedicas>> all(@Path("id") int idU);

}

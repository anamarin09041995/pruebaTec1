package com.example.anamarin.pruebatec1;

import android.app.Application;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class App extends Application {

    public static Retrofit retrofit;

    @Override
    public void onCreate(){
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("localhost:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }
}

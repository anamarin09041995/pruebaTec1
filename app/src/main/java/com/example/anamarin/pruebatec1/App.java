package com.example.anamarin.pruebatec1;

import android.app.Application;

import retrofit2.Retrofit;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class App extends Application {

    public static Retrofit retrofit;

    @Override
    public void onCreate(){
        super.onCreate();
    }
}

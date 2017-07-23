package com.example.anamarin.pruebatec1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anamarin.pruebatec1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NuevaCitaFragment extends Fragment {


    public NuevaCitaFragment() {  }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nueva_cita, container, false);
    }

    public static NuevaCitaFragment instance(){
        NuevaCitaFragment fragment = new NuevaCitaFragment();
        return fragment;
    }

}

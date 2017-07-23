package com.example.anamarin.pruebatec1;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anamarin.pruebatec1.databinding.ActivityMainBinding;
import com.example.anamarin.pruebatec1.fragments.CitasMedicasFragment;
import com.example.anamarin.pruebatec1.models.CitasMedicas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        putFragment(R.id.container, CitasMedicasFragment.instance());

        List<Fragment> pages = new ArrayList<>();
        pages.add(CitasMedicasFragment.instance());

    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }

    public void setContent(int navItem){
        int content = navItem;
        putFragment(R.id.container, CitasMedicasFragment.instance());
    }
}

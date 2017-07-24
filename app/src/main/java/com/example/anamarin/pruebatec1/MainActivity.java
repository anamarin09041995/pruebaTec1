package com.example.anamarin.pruebatec1;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.anamarin.pruebatec1.adapters.Pager;
import com.example.anamarin.pruebatec1.databinding.ActivityMainBinding;
import com.example.anamarin.pruebatec1.fragments.CitasMedicasFragment;
import com.example.anamarin.pruebatec1.fragments.NuevaCitaFragment;
import com.example.anamarin.pruebatec1.models.CitasMedicas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        List<Fragment> pages = new ArrayList<>();
        pages.add(CitasMedicasFragment.instance());
        pages.add(NuevaCitaFragment.instance());
        Pager adapter = new Pager(getSupportFragmentManager(), pages);
        binding.pager.setAdapter(adapter);
        binding.tabs.setupWithViewPager(binding.pager);

    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }

    public void setContent(int navItem){
        content = navItem;
        switch (navItem) {
            case R.id.navigation_citas:
                getSupportActionBar().setTitle(R.string.pestana_citas_medicas);
                putFragment(R.id.container, CitasMedicasFragment.instance());
                break;
            case R.id.navigation_nuevaCita:
                getSupportActionBar().setTitle(R.string.pestana_nueva_cita);
                putFragment(R.id.container, NuevaCitaFragment.instance());
                break;

        }
    }
}

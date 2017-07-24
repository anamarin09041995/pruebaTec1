package com.example.anamarin.pruebatec1.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class Pager extends FragmentStatePagerAdapter {

    List<Fragment> data;

    public Pager(FragmentManager fm, List<Fragment> data) {
        super(fm);
        this.data  = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "Citas medicas";
        }else{
            return "Nueva Cita";
        }
    }
}

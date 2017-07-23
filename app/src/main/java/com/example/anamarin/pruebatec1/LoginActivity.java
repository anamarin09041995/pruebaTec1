package com.example.anamarin.pruebatec1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.anamarin.pruebatec1.databinding.ActivityLoginBinding;

/**
 * Created by Ana Marin on 21/07/2017.
 */

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setHandler(this);

    }

    public void goToMain(){
        String email, password;

        email = binding.cedula.getText().toString();
        password = binding.password.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void goToRegistro(){

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
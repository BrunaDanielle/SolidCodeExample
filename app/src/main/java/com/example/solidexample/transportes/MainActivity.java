package com.example.solidexample.transportes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.solidexample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro c1 = new Carro();
        Bicicleta b1 = new Bicicleta();
        comprarVeiculo(c1);
        comprarVeiculo(b1);
    }
    public void comprarVeiculo(Transporte transp){
        //...
    }
}

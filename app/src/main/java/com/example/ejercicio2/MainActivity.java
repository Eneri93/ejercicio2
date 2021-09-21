package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_numero= null;
    private TextView resul=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero=(EditText) findViewById(R.id.edt_numero);
        resul=(TextView) findViewById(R.id.resultadoC);
    }

    public void cuadrado(View v) {
       // Button boton=(Button) v;
        //boton.setText("cambio el texto");
        String tex_numero= String.valueOf(edt_numero.getText());
        double numero= Double.valueOf(tex_numero);
        double resultado= numero*numero;
        resul.setText(String.valueOf(resultado));
        Toast.makeText(this,"el cuadrado vale " + String.valueOf(resultado),Toast.LENGTH_LONG).show();
    }
}
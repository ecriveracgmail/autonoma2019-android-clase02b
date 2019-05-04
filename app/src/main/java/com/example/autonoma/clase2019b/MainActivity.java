package com.example.autonoma.clase2019b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    EditText etNombre,etClave,etCorreo,etPhone;
    Button btnGrabar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // crear las referencias las cajas de texto
        etNombre = (EditText) findViewById(R.id.etNombre);
        etClave = findViewById(R.id.etClave);
        etCorreo= findViewById(R.id.etCorreo);
        etPhone = findViewById(R.id.etTelefono);

        // crear las referencias al boton
        btnGrabar = (Button) findViewById(R.id.btnGrabar);

        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intento para llamar al DetalleActivity
                Intent intent = new Intent(
                        MainActivity.this,
                        DetalleActivity.class);

                if(etClave.getText().toString().equals("1234")){
                    // le vamos a pasar valores
                    intent.putExtra("nombre",etNombre.getText().toString());
                    intent.putExtra("correo",etCorreo.getText().toString());
                    intent.putExtra("telefono",etPhone.getText().toString());

                    //llamada
                    startActivity(intent);
                }else{
                    Toast.makeText(
                            MainActivity.this,
                            "Ingrese Clave Correcta",
                            Toast.LENGTH_SHORT).show();

                }



            }
        });

    }

}

package com.luigi.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmacionDatos extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("NOMBRE_COMPLETO");
        String fechaNacimiento = parametros.getString("FECHA_NACIMIENTO");
        String telefono = parametros.getString("TELEFONO");
        String email = parametros.getString("EMAIL");
        String descripcion = parametros.getString("DESCRIPCION");

        TextView tvNombre = (TextView) findViewById(R.id.nombreCompleto);
        TextView tvFechaNacimiento = (TextView) findViewById(R.id.fechaNacimiento);
        TextView tvTelefono = (TextView) findViewById(R.id.telefono);
        TextView tvEmail = (TextView) findViewById(R.id.email);
        TextView tvDescripcion = (TextView) findViewById(R.id.descripcion);

        tvNombre.setText(nombre);
        tvFechaNacimiento.setText("Fecha de nacimiento: "+ fechaNacimiento);
        tvTelefono.setText("Tel.: " + telefono);
        tvEmail.setText("Email: "+ email);
        tvDescripcion.setText(descripcion);

        Button btnEditar = (Button) findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

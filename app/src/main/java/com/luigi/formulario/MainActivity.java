package com.luigi.formulario;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TextInputEditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nombreCompleto;
    private TextInputEditText fechaNacimiento;
    private TextInputEditText telefono;
    private TextInputEditText email;
    private TextInputEditText descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        nombreCompleto = (TextInputEditText) findViewById(R.id.inputNombreCompleto);
        fechaNacimiento = (TextInputEditText) findViewById(R.id.inputFechaNacimiento);
        telefono = (TextInputEditText) findViewById(R.id.inputTelefono);
        email = (TextInputEditText) findViewById(R.id.inputEmail);
        descripcion = (TextInputEditText) findViewById(R.id.inputDescripcion);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfirmacionDatos.class);
                intent.putExtra("NOMBRE_COMPLETO",nombreCompleto.getText().toString());
                intent.putExtra("FECHA_NACIMIENTO",fechaNacimiento.getText().toString());
                intent.putExtra("TELEFONO",telefono.getText().toString());
                intent.putExtra("EMAIL",email.getText().toString());
                intent.putExtra("DESCRIPCION",descripcion.getText().toString());
                startActivity(intent);
            }
        });

    }

    public void mostrarPickerFecha(View v){
        DialogFragment fragmento = new FechaPickerFragment();
        fragmento.show(getSupportFragmentManager(), "datePicker");
    }
}

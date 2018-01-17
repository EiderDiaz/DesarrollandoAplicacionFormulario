package com.luigi.formulario;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;


import java.util.Calendar;


public class FechaPickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Configuramos la fecha actual como fecha por default en el picker
        final Calendar calendario = Calendar.getInstance();
        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, anio, mes, dia);
    }


    public void onDateSet(DatePicker view, int anio, int mes, int dia) {

        String fecha = String.valueOf(dia) + "/" + String.valueOf(mes+1) + "/" + String.valueOf(anio);
        TextInputEditText inputFechaNacimiento = (TextInputEditText) getActivity().findViewById(R.id.inputFechaNacimiento);
        inputFechaNacimiento.setText(fecha);
    }
}
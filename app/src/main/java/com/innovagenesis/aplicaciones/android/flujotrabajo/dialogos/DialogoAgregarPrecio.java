package com.innovagenesis.aplicaciones.android.flujotrabajo.dialogos;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

import com.innovagenesis.aplicaciones.android.flujotrabajo.R;

/**
 * Dialogo encargado de agregar los precios
 * Created by alexi on 08/06/2017.
 */

public class DialogoAgregarPrecio extends DialogFragment {

    public static final String TAG = "dialogo_insertar_precio";


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.dialogo_agregar_precio,null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(view);

        return builder.create();
    }
}

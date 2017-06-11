package com.innovagenesis.aplicaciones.android.flujotrabajo.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.innovagenesis.aplicaciones.android.flujotrabajo.R;

import static com.innovagenesis.aplicaciones.android.flujotrabajo.R.color.orange_500;

/**
 * Dialogo encargado de agregar los precios
 * Created by alexi on 08/06/2017.
 */

public class DialogoAgregarPrecio extends DialogFragment {

    public static final String TAG = "dialogo_insertar_precio";
    private View view;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final int orange500 = ContextCompat.getColor(getActivity(), orange_500);

        view = LayoutInflater.from(getContext())
                .inflate(R.layout.dialogo_agregar_precio, null);

        TextInputLayout textInputLayoutCodigoBarras
                = (TextInputLayout) view.findViewById(R.id.input_layout_cod_barras);
        TextInputEditText textInputEditTextCodigoBarras
                = (TextInputEditText) view.findViewById(R.id.input_edit_text_cod_barras);

        Button buttonGuardar = (Button) view.findViewById(R.id.btn_guardar_precio);
        Button buttonCancelar = (Button) view.findViewById(R.id.btn_descartar_precio);

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dismiss();
            }
        });

        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });


        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(view);

        return builder.create();
    }
}

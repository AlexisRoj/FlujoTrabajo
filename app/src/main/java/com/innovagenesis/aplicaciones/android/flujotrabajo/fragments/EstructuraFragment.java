package com.innovagenesis.aplicaciones.android.flujotrabajo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.innovagenesis.aplicaciones.android.flujotrabajo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EstructuraFragment extends Fragment {


    public EstructuraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_estructura, container, false);
    }

}

package com.innovagenesis.aplicaciones.android.flujotrabajo.fragments;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.innovagenesis.aplicaciones.android.flujotrabajo.R;


/**
 * Fragment que desplega el contenido de los tabs
 */
public class BaseFragment extends Fragment {

    private TypedArray imgTabs;

    private String name;
    private static final String ARG_NAME = "name";

    private int position;
    private static final String ARG_DRAWABLE = "position";

    private int idArreglo;
    private static final String ARG_ARREGLO = "idArreglo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_principal, container, false);
    }

    public static Fragment getInstance(String name, int position, int idArreglo) {
        BaseFragment fragment = new BaseFragment();

        /** Parametros que trae el fragment*/
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putInt(ARG_DRAWABLE, position);
        args.putInt(ARG_ARREGLO, idArreglo);

        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            name = args.getString(ARG_NAME);
            position = args.getInt(ARG_DRAWABLE);
            idArreglo = args.getInt(ARG_ARREGLO);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgTabs = getContext().getResources().obtainTypedArray(R.array.tabs_name);


    }

}

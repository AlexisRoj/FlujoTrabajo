package com.innovagenesis.aplicaciones.android.flujotrabajo.fragments;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.innovagenesis.aplicaciones.android.flujotrabajo.R;
import com.innovagenesis.aplicaciones.android.flujotrabajo.adapters.BaseViewPagerAdapter;

/**
 * Administra los tabs
 * Created by Alexis on 22/11/2016.
 */

public class TabsFragment extends Fragment {

    private String[] tabs;
    private TypedArray imgTabs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_bar_main_with_tabs, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



            /** Seleciona la lista a desplegar de iconos e imagenes*/

                tabs = getContext().getResources().getStringArray(R.array.tabs_name);
                imgTabs = getContext().getResources().obtainTypedArray(R.array.tabs_img);


        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);

        /** Adjunta el adapter*/
        viewPager.setAdapter(new BookViewPagerAdapter(getActivity().getSupportFragmentManager()));


        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE); // para cuando es mas de 3 tabs
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        /**
         *
         * Administra los colores del drawer, toolbar y tabs
         *
         * */

        @SuppressLint("Recycle")


        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar);


        if (Build.VERSION.SDK_INT >= 21) {
            /** Cambia colores apartir de la version 21*/
        }


        /** Incerta el icono en el tab */
        for (int i = 0; i < imgTabs.length(); i++) {

            TabLayout.Tab tab = tabLayout.getTabAt(i);

            if (tab != null){
                tab.setIcon(imgTabs.getResourceId(i,0));
                //tab.setText(null); //elimina el texto de los tabs
            }
        }
    }



    private class BookViewPagerAdapter extends BaseViewPagerAdapter {

        private BookViewPagerAdapter(FragmentManager manager) {
            super(manager, tabs,1);
        }


    }
}





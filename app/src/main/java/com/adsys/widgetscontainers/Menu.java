package com.adsys.widgetscontainers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Menu extends Fragment {

    public Menu() {
        super(R.layout.menu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu, container, false);
        view.findViewById(R.id.b_checkbox)     .setOnClickListener(goTo(CheckBoxPage.class));
        view.findViewById(R.id.b_radiobutton)  .setOnClickListener(goTo(RadioButtonPage.class));
        view.findViewById(R.id.b_weight)       .setOnClickListener(goTo(WeightPage.class));
        view.findViewById(R.id.b_relative)     .setOnClickListener(goTo(RelativePage.class));
        view.findViewById(R.id.b_overlap)      .setOnClickListener(goTo(OverlapPage.class));
        view.findViewById(R.id.b_table)        .setOnClickListener(goTo(TablePage.class));
        view.findViewById(R.id.b_scroll)       .setOnClickListener(goTo(ScrollPage.class));

        return view;
    }

    private View.OnClickListener goTo(Class<?extends Fragment> fragment) {
        return view -> {
            MainActivity activity = (MainActivity) getActivity();
            assert activity != null;
            activity.changeFragment(fragment);
        };
    }

}

package com.adsys.widgetscontainers;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RadioButtonPage extends Fragment {

    public RadioButtonPage() {
        super(R.layout.radio_button_page);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.radio_button_page, container, false);
        LinearLayout layout       = view.findViewById(R.id.layout);
        RadioGroup orientation    = view.findViewById(R.id.orientation);
        RadioGroup gravity        = view.findViewById(R.id.gravity);

        orientation.setOnCheckedChangeListener((radioGroup, i) ->
                layout.setOrientation((i == R.id.vertical) ? LinearLayout.VERTICAL :
                                                             LinearLayout.HORIZONTAL
                )
        );

        gravity.setOnCheckedChangeListener((radioGroup, i) ->
                layout.setGravity((i == R.id.left)   ? Gravity.START :
                                  (i == R.id.center) ? Gravity.CENTER :
                                                       Gravity.END
                )
        );

        return view;
    }

}

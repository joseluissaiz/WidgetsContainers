package com.adsys.widgetscontainers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CheckBoxPage extends Fragment {

    public CheckBoxPage() {
        super(R.layout.check_box_page);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.check_box_page, container, false);
        CheckBox cbox = view.findViewById(R.id.checkbox);

        cbox.setOnClickListener(view1 -> cbox.setText(
                cbox.isChecked() ? R.string.checked : R.string.unchecked
        ));

        return view;
    }
}

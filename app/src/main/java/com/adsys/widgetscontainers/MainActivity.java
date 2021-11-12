package com.adsys.widgetscontainers;

import static java.lang.System.exit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Bundle savedState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedState = savedInstanceState;
        setContentView(R.layout.activity_main);
        changeFragment(Menu.class);
    }

    public void changeFragment(Class<?extends Fragment> fragment) {
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .setCustomAnimations(R.anim.fade_out, R.anim.slide_out, R.anim.fade_in, R.anim.slide_in)
                .replace(R.id.fragment_container_view, fragment, null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        Fragment currFragment = getSupportFragmentManager().getFragments().get(0);
        if ((currFragment.getClass() == Menu.class)) {
            exit(1);
        } else {
            changeFragment(Menu.class);
        }
    }
}
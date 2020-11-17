package com.example.lastexamplemaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Change(View view){
        Fragment fragment = null;

        switch (view.getId()){
            case R.id.button:
                fragment = new ItemFragment();
                break;
            case R.id.button2:
                fragment = new MapsFragment();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_place, fragment);
        ft.commit();

    }
}
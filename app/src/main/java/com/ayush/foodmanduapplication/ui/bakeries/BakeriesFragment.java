package com.ayush.foodmanduapplication.ui.bakeries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ayush.foodmanduapplication.R;

public class BakeriesFragment extends Fragment {

    private BakeriesViewModel bakeriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bakeriesViewModel =
                ViewModelProviders.of(this).get(BakeriesViewModel.class);
        View root = inflater.inflate(R.layout.activity_login, container, false);

        return root;
    }
}
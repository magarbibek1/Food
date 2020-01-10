package com.ayush.foodmanduapplication.ui.basket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ayush.foodmanduapplication.R;

public class basketFragment extends Fragment {

    private basketViewModel basketViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        basketViewModel =
                ViewModelProviders.of(this).get(basketViewModel.class);
        View root = inflater.inflate(R.layout.activity_login, container, false);

        return root;
    }
}
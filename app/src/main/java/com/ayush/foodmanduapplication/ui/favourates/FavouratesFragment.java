package com.ayush.foodmanduapplication.ui.favourates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ayush.foodmanduapplication.R;

public class FavouratesFragment extends Fragment  {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favourates, container, false);

        return view;
    }
}
package com.ayush.foodmanduapplication.ui.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ayush.foodmanduapplication.R;

public class NotificationFragment extends Fragment {

    private NotificationViewModel notificationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationViewModel =
                ViewModelProviders.of(this).get(NotificationViewModel.class);
        View root = inflater.inflate(R.layout.activity_login, container, false);

        return root;
    }
}
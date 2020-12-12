package com.example.android.holycow.ui.feedback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.holycow.R;

public class feedbackFragment extends Fragment {

    private feedbackViewModel feedbackViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        feedbackViewModel =
                new ViewModelProvider(this).get(feedbackViewModel.class);
        View root = inflater.inflate(R.layout.fragment_feedback, container, false);
        final TextView textView = (TextView) root.findViewById(R.id.text_feedback);
        feedbackViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
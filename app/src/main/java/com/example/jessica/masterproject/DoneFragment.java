package com.example.jessica.masterproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DoneFragment extends Fragment {

    public DoneFragment() {
    }

    public static DoneFragment newInstance() {
        return new DoneFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.done, container, false);
    }
}

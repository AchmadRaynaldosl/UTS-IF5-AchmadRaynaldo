package com.apps.aldoapps.TabMenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.aldoapps.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyTabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyTabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_tab, container, false);
    }
}

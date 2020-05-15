package com.apps.aldoapps.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.apps.aldoapps.TabMenu.InterestFragment;
import com.apps.aldoapps.TabMenu.ProfileFragment;

public class AdapterHome extends FragmentStatePagerAdapter {

    private int number_tabs;

    public AdapterHome(@NonNull FragmentManager fm, int number_tabs) {
        super(fm);
        this.number_tabs = number_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new ProfileFragment();
            case 1 :
                return new InterestFragment();
            default :
                return null;
        }
    }

    @Override
    public int getCount() {
        return number_tabs;
    }
}

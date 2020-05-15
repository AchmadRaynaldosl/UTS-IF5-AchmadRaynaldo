package com.apps.aldoapps.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.apps.aldoapps.TabMenu.DailyTabFragment;
import com.apps.aldoapps.TabMenu.FriendTabFragment;

public class AdapterDaily extends FragmentStatePagerAdapter {

    private int num_tabs;

    public AdapterDaily(@NonNull FragmentManager fm, int num_tabs) {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DailyTabFragment();
            case 1:
                return new FriendTabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}

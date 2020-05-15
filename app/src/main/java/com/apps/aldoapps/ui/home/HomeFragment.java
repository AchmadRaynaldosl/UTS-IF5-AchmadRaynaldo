package com.apps.aldoapps.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.apps.aldoapps.Adapter.AdapterHome;
import com.apps.aldoapps.R;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final TabLayout tabHome = root.findViewById(R.id.tab_home);
        final ViewPager viewPagerHome = root.findViewById(R.id.view_pager_home);

        assert getFragmentManager() != null;
        AdapterHome adapterHome = new AdapterHome(getFragmentManager(), tabHome.getTabCount());

        viewPagerHome.setAdapter(adapterHome);

        viewPagerHome.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabHome));

        tabHome.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerHome.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        return root;
    }
}

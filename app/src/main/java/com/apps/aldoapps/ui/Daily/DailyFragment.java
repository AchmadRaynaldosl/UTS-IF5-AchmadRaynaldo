package com.apps.aldoapps.ui.Daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.apps.aldoapps.Adapter.AdapterDaily;
import com.apps.aldoapps.R;
import com.google.android.material.tabs.TabLayout;

public class DailyFragment extends Fragment {

    private DailyViewModel dailyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dailyViewModel =
                ViewModelProviders.of(this).get(DailyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        final TabLayout tabDaily = root.findViewById(R.id.tab_daily);
        final ViewPager pagerDaily= root.findViewById(R.id.pager_daily);

        assert getFragmentManager() != null;
        AdapterDaily adapterDaily = new AdapterDaily(getFragmentManager(), tabDaily.getTabCount());

        pagerDaily.setAdapter(adapterDaily);

        pagerDaily.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabDaily));

        tabDaily.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pagerDaily.setCurrentItem(tab.getPosition());
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

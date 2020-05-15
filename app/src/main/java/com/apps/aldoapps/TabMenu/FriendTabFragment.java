package com.apps.aldoapps.TabMenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.aldoapps.Adapter.AdapterFriend;
import com.apps.aldoapps.Model.ModelFriend;
import com.apps.aldoapps.R;

import java.util.ArrayList;
import java.util.Objects;

public class FriendTabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View tab = inflater.inflate(R.layout.fragment_friend_tab, container, false);

        final RecyclerView recyclerView = tab.findViewById(R.id.recycler_view_friend);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ModelFriend> ArrayFriend = FriendTabData.prepareData();
        AdapterFriend adapterFriend = new AdapterFriend(getActivity().getApplicationContext(), ArrayFriend);
        recyclerView.setAdapter(adapterFriend);

        return tab;
    }
}

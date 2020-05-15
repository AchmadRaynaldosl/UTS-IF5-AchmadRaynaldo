package com.apps.aldoapps.ui.gallery;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.aldoapps.Adapter.AdapterGallery;
import com.apps.aldoapps.Model.ModelGallery;
import com.apps.aldoapps.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        final RecyclerView recyclerView = root.findViewById(R.id.recycler_view_gallery);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ModelGallery> arrayImage = Gallery_data.prepareData();
        AdapterGallery adapter = new AdapterGallery(getActivity().getApplicationContext(),arrayImage);
        recyclerView.setAdapter(adapter);

        return root;
    }
}

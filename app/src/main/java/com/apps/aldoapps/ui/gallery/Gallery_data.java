package com.apps.aldoapps.ui.gallery;

import com.apps.aldoapps.Model.ModelGallery;
import com.apps.aldoapps.R;

import java.util.ArrayList;

class Gallery_data {

    private static final int[] gallery = {
            R.drawable.pict1,
            R.drawable.pict2,
            R.drawable.pict3,
            R.drawable.pict4
    };

    static ArrayList<ModelGallery> prepareData(){
        ArrayList<ModelGallery> ArrayData = new ArrayList<>();
        for (int i=0; i<gallery.length; i++){
            ModelGallery modelInterest = new ModelGallery();
            modelInterest.setImage(gallery[i]);
            ArrayData.add(modelInterest);
        }
        return ArrayData;
    }
}

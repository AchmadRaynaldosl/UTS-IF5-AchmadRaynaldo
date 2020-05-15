package com.apps.aldoapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.aldoapps.Model.ModelGallery;
import com.apps.aldoapps.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterGallery extends RecyclerView.Adapter<AdapterGallery.ViewHolder> {

    private ArrayList<ModelGallery> listGallery;
    private Context context;

    public AdapterGallery(Context context, ArrayList<ModelGallery> listGallery){
        this.context = context;
        this.listGallery = listGallery;
    }

    @NonNull
    @Override
    public AdapterGallery.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_gallery, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGallery.ViewHolder holder, int position) {
        Picasso.with(context).load(listGallery.get(position).getImage()).resize(250, 290).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return listGallery.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.img_view);
        }
    }
}

package com.apps.aldoapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.aldoapps.Model.ModelFriend;
import com.apps.aldoapps.Model.ModelGallery;
import com.apps.aldoapps.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterFriend extends RecyclerView.Adapter<AdapterFriend.ViewHolder> {

    private ArrayList<ModelFriend> listFriend;
    private Context context;

    public AdapterFriend(Context context, ArrayList<ModelFriend> listFriend){
        this.context = context;
        this.listFriend = listFriend;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_friend, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFriend.ViewHolder holder, int position) {
        Picasso.with(context).load(listFriend.get(position).getImage_friend()).resize(250, 290).into(holder.img_friend);
    }

    @Override
    public int getItemCount() {
        return listFriend.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_friend;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_friend = itemView.findViewById(R.id.imageView2);
        }
    }
}

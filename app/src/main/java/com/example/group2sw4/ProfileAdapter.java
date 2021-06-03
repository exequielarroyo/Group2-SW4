package com.example.group2sw4;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    String names[];
    int images[];

    public ProfileAdapter(String[] names, int[] images) {
        this.names = names;
        this.images = images;
    }

    @NonNull
    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.profile_holder, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {
        holder.profilePictureImageView.setImageResource(images[position]);
        holder.profileNameTextView.setText(names[position]);
        holder.profileTypeTextView.setText((names[position].equals("Exequiel Arroyo")) ? "Leader" : "Member");
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profilePictureImageView;
        TextView profileNameTextView;
        TextView profileTypeTextView;
        CardView profileHolderCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePictureImageView = itemView.findViewById(R.id.profilePictureImageView);
            profileNameTextView = itemView.findViewById(R.id.profileNameTextView);
            profileTypeTextView = itemView.findViewById(R.id.profileTypeTextView);
            profileHolderCardView = itemView.findViewById(R.id.profileHolderCardView);
        }
    }
}

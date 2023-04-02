package com.badorek.viikko_10_android;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageview;
    TextView userName, userEmail, userDegreeType;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.tvUserName);
        userEmail = itemView.findViewById(R.id.tvEmail);
        userDegreeType = itemView.findViewById(R.id.tvDegreeType);

    }
}

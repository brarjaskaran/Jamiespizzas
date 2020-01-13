package com.example.jamiespizza.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jamiespizza.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView textProductName, textProductDescription;
    public ImageView imageView;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_image);
        textProductName = itemView.findViewById(R.id.product_name);
        textProductDescription = itemView.findViewById(R.id.product_description);


    }

    @Override
    public void onClick(View v) {

    }
}

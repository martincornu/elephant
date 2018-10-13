package com.alcedo.marty.e_lephant.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import com.alcedo.marty.e_lephant.R;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Martin on 13/10/2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView textViewView;
    private ImageView imageView;

    //itemView = 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        //findView
        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    //fill cellule according MyObject
    public void bind(MyObject myObject) {
        textViewView.setText(myObject.getText());
        Picasso.get().load(myObject.getDrawableId()).into(imageView);
    }
}

package com.alcedo.marty.e_lephant.activities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alcedo.marty.e_lephant.R;

import java.util.List;

/**
 * Created by Martin on 13/10/2018.
 */

public class CardAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<MyObject> list;

    public CardAdapter(List<MyObject> list) {
        this.list = list;
    }

    //create viewHolder
    //indicate view to inflate (from layout xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_cards,viewGroup,false);
        return new MyViewHolder(view);
    }

    //fill cellule with text/image of each MyObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}

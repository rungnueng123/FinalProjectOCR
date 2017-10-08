package com.ite17.pikulkaew.teamdr.ocrproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.ite17.pikulkaew.teamdr.ocrproject.R;
import com.ite17.pikulkaew.teamdr.ocrproject.holder.MenuHolder;
import com.ite17.pikulkaew.teamdr.ocrproject.model.ItemClickCallback;
import com.ite17.pikulkaew.teamdr.ocrproject.model.dao.MenuListItem;

import java.util.List;

/**
 * Created by j.poobest on 9/24/2017 AD.
 */

public class MenuListAdapter extends RecyclerView.Adapter<MenuHolder>  {

    List<MenuListItem> items;
    private ItemClickCallback mListener;

    public void setItemClickCallback(final ItemClickCallback mListener){
        this.mListener = mListener;
    }

    public MenuListAdapter(List<MenuListItem> items) {
        this.items = items;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_list_item, parent, false);
        return new MenuHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(MenuHolder holder, int position) {
        MenuListItem item = items.get(position);
//
//        holder.tvName.setText(item.getNameMenu());
//        holder.imgView.setImageResource(item.getIdImgMenu());
        if (holder instanceof MenuHolder){
            MenuHolder menuHolder = holder;
            menuHolder.imgView.setImageResource(item.getIdImgMenu());
        }


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}

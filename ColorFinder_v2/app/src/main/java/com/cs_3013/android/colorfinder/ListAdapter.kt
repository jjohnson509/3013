package com.cs_3013.android.colorfinder

import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: ArrayList<SavedColor>) : RecyclerView.Adapter<ColorViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ColorViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val color: SavedColor = list[position]
        holder.bind(color)


    }

    override fun getItemCount(): Int = list.size





}
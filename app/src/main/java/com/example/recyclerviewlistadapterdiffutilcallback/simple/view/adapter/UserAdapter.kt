package com.example.recyclerviewlistadapterdiffutilcallback.simple.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.*
import com.example.recyclerviewlistadapterdiffutilcallback.simple.view.ItemStateDiffUtilCallBack
import com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder.HorizontalViewHolder
import com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder.UserViewHolder

class UserAdapter(private val context: Context): ListAdapter<BaseItemState, RecyclerView.ViewHolder>(
    AsyncDifferConfig.Builder<BaseItemState>(
        ItemStateDiffUtilCallBack()
    ).build()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemStateType.values()[viewType].createViewHolder(
            parent,
            LayoutInflater.from(parent.context),
            context
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemState = getItem(position)
        when(holder) {
            is UserViewHolder -> holder.bindItems(itemState as UserItemState)
            is HorizontalViewHolder -> holder.bindItems(itemState as HorizontalItemState)
            else -> throw IllegalArgumentException("Unknown view holder")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).itemType.ordinal
    }
}
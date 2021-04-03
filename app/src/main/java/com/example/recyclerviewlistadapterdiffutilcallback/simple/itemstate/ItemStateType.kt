package com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemHorizontalRecyclerViewBinding
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemHorizontalUserBinding
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemUserBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder.HorizontalUserViewHolder
import com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder.HorizontalViewHolder
import com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder.UserViewHolder

enum class ItemStateType {
    USER {
        override fun createViewHolder(
            parent: ViewGroup,
            layoutInflater: LayoutInflater,
            context: Context
        ): RecyclerView.ViewHolder {
            val binding = ItemUserBinding.inflate(layoutInflater, parent, false)
            return UserViewHolder(binding)
        }
    },

    HORIZONTAL {
        override fun createViewHolder(
            parent: ViewGroup,
            layoutInflater: LayoutInflater,
            context: Context
        ): RecyclerView.ViewHolder {
            val binding = ItemHorizontalRecyclerViewBinding.inflate(layoutInflater, parent, false)
            return HorizontalViewHolder(binding, context)
        }
    },

    HORIZONTAL_USER {
        override fun createViewHolder(
            parent: ViewGroup,
            layoutInflater: LayoutInflater,
            context: Context
        ): RecyclerView.ViewHolder {
            val binding = ItemHorizontalUserBinding.inflate(layoutInflater, parent, false)
            return HorizontalUserViewHolder(binding)
        }

    };

    abstract fun createViewHolder(
        parent: ViewGroup,
        layoutInflater: LayoutInflater,
        context: Context
    ): RecyclerView.ViewHolder
}
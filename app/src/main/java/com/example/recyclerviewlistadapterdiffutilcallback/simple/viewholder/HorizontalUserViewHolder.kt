package com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemHorizontalUserBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.HorizontalUserItemState
import com.example.recyclerviewlistadapterdiffutilcallback.simple.view.adapter.HorizontalUserAdapter

class HorizontalUserViewHolder(
    private val binding: ItemHorizontalUserBinding,
): RecyclerView.ViewHolder(binding.root) {
    fun bindItems(itemState: HorizontalUserItemState) {
        with(binding) {
            userName.text = itemState.userName
        }
    }
}
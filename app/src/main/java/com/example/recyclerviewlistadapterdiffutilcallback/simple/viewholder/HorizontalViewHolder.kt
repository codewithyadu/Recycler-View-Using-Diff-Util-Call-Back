package com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemHorizontalRecyclerViewBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.HorizontalItemState
import com.example.recyclerviewlistadapterdiffutilcallback.simple.view.adapter.HorizontalUserAdapter

class HorizontalViewHolder(
    private val binding: ItemHorizontalRecyclerViewBinding,
    private val context: Context
): RecyclerView.ViewHolder(binding.root) {
    fun bindItems(itemState: HorizontalItemState) {
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter = HorizontalUserAdapter(context)
        with(binding) {
            horizontalRecyclerView.layoutManager = layoutManager
            horizontalRecyclerView.adapter = adapter
        }
        adapter.submitList(itemState.list)
    }
}
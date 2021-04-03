package com.example.recyclerviewlistadapterdiffutilcallback.simple.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ItemUserBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.UserItemState

class UserViewHolder(
    private val binding: ItemUserBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bindItems(itemState: UserItemState) {
        with(binding) {
            userName.text = itemState.userName
        }
    }
}
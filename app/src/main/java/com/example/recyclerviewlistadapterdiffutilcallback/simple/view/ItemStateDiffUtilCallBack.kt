package com.example.recyclerviewlistadapterdiffutilcallback.simple.view

import androidx.recyclerview.widget.DiffUtil
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.BaseItemState

class ItemStateDiffUtilCallBack : DiffUtil.ItemCallback<BaseItemState>() {
    override fun areItemsTheSame(oldItem: BaseItemState, newItem: BaseItemState): Boolean {
        return oldItem.itemType == newItem.itemType
    }

    override fun areContentsTheSame(oldItem: BaseItemState, newItem: BaseItemState): Boolean {
        return oldItem == newItem
    }
}
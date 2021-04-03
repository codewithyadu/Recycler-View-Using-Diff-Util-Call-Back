package com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate

data class HorizontalItemState(
    val list: List<HorizontalUserItemState>,
    override val itemType: ItemStateType = ItemStateType.HORIZONTAL
) : BaseItemState
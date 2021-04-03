package com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate

data class HorizontalUserItemState(
    val userName: String,
    override val itemType: ItemStateType = ItemStateType.HORIZONTAL_USER
): BaseItemState
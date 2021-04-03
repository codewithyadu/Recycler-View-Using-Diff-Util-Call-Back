package com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate

data class UserItemState(
    var userName: String,
    override val itemType: ItemStateType = ItemStateType.USER
): BaseItemState
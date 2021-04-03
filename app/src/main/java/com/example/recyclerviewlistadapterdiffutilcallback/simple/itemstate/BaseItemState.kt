package com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate

interface BaseItemState {
    val itemType: ItemStateType

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int
}
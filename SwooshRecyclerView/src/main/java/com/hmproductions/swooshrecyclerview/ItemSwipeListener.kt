package com.hmproductions.swooshrecyclerview

import androidx.recyclerview.widget.RecyclerView

interface ItemSwipeListener {
    fun onItemSwipe(viewHolder: RecyclerView.ViewHolder, direction: SwooshDirection, position: Int)
}
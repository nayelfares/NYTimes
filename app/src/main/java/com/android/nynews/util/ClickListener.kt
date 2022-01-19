package com.android.nynews.util

import com.android.nynews.room.Article

interface ClickListener {
    fun onItemClick(item : Article)
}
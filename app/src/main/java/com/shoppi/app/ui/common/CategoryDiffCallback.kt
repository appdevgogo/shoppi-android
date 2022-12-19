package com.shoppi.app.ui.common

import androidx.recyclerview.widget.DiffUtil
import com.shoppi.app.model.TopSelling

class TopSellingDiffCallback: DiffUtil.ItemCallback<TopSelling>() {
    override fun areContentsTheSame(oldItem: TopSelling, newItem: TopSelling): Boolean {
        return oldItem.title.text == newItem.title.text
    }

    override fun areItemsTheSame(oldItem: TopSelling, newItem: TopSelling): Boolean {
        return oldItem == newItem
    }
}
package com.example.testtask.menu.mainmenu

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.model.CatalogData

class CatalogAdapter: ListAdapter<CatalogData, CatalogAdapter.ViewHolder>(DiffCallback())  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_catalog, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        private val titleCatalog: TextView = itemView.findViewById(R.id.catalog_name)
        private val imageCatalog: ImageView = itemView.findViewById(R.id.catalog_image)

        fun bind(item: CatalogData) {
            titleCatalog.text = item.titleCatalog
            imageCatalog.setImageResource(item.imageCatalog)

        }

    }


    class DiffCallback : DiffUtil.ItemCallback<CatalogData>() {
        override fun areItemsTheSame(oldItem: CatalogData, newItem: CatalogData): Boolean {
            return oldItem.id == newItem.id
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: CatalogData, newItem: CatalogData): Boolean {
            return oldItem == newItem
        }
    }




}


package com.example.testtask.menu.mainmenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.*
import com.example.testtask.R
import com.example.testtask.model.ProductData

class ProductAdapter :
    ListAdapter<ProductData, ProductAdapter.ViewHolder>(DiffCallback())  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.product_name)
        private val price: TextView = itemView.findViewById(R.id.product_price)
        private val imageProduct: ImageView = itemView.findViewById(R.id.image_product)


        fun bind(item: ProductData) {
            title.text = item.titleProduct
            price.text = item.price
            imageProduct.setImageResource(item.imageProduct)

        }


    }


    class DiffCallback : DiffUtil.ItemCallback<ProductData>() {
        override fun areItemsTheSame(oldItem: ProductData, newItem: ProductData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ProductData, newItem: ProductData): Boolean {
            return oldItem == newItem
        }
    }




}
package com.example.testtask.menu.mainmenu

import android.os.Build
import android.os.Bundle
import android.view.CollapsibleActionView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.model.DataGenerator
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.recycler_limited_offer).apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

            val adapter = ProductAdapter()

            this.adapter = adapter

            adapter.submitList(DataGenerator.generateProductList())

        }

        view.findViewById<RecyclerView>(R.id.recycler_best_price).apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

            val adapter = ProductAdapter()

            this.adapter = adapter

            adapter.submitList(DataGenerator.generateProductList())

        }

        view.findViewById<RecyclerView>(R.id.recycler_catalog).apply {
            this.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

            val adapter = CatalogAdapter()

            this.adapter = adapter

            adapter.submitList(DataGenerator.generateCatalogList())

        }


    }

}
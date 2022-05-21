package com.example.amazonuserhomescreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonuserhomescreen.R
import com.example.amazonuserhomescreen.databinding.ActivityMainBinding
import com.example.amazonuserhomescreen.databinding.RowItemBinding
import com.example.amazonuserhomescreen.datamodel.CategoriesModel

class ItemAdapter(private val listItem:List<CategoriesModel>):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    class ViewHolder(private val binding:RowItemBinding):RecyclerView.ViewHolder(binding.root){
        val textCategory:TextView = binding.itemTitle
        val imageCategory:ImageView = binding.itemImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageCategory.setImageResource(listItem[position].categoryImage)
        holder.textCategory.text = listItem[position].categoryName
    }

    override fun getItemCount(): Int {
        return listItem.size
    }


}
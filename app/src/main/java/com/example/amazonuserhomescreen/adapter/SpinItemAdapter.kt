package com.example.amazonuserhomescreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonuserhomescreen.databinding.RowItemBinding
import com.example.amazonuserhomescreen.databinding.RowItemTwoBinding
import com.example.amazonuserhomescreen.datamodel.CategoriesModel
import com.example.amazonuserhomescreen.datamodel.SpinwinModel

class SpinItemAdapter(private val listItem:List<SpinwinModel>): RecyclerView.Adapter<SpinItemAdapter.ViewHolder>(){

    class ViewHolder(private val binding: RowItemTwoBinding): RecyclerView.ViewHolder(binding.root){

        val imageSpin: ImageView = binding.spinWinImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RowItemTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageSpin.setImageResource(listItem[position].imageSpinwin)

    }

    override fun getItemCount(): Int {
        return listItem.size
    }


}
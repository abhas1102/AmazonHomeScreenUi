package com.example.amazonuserhomescreen.data

import com.example.amazonuserhomescreen.R
import com.example.amazonuserhomescreen.datamodel.CategoriesModel
import com.example.amazonuserhomescreen.datamodel.SpinwinModel

class CategoryDataSource {

    fun loadCategories():List<CategoriesModel>{
        return listOf<CategoriesModel>(
            CategoriesModel("Appliances", R.drawable.appliances),
            CategoriesModel("Books", R.drawable.book),
            CategoriesModel("Electronics", R.drawable.electronics),
            CategoriesModel("Fashion", R.drawable.fashion),
            CategoriesModel("Grocery",R.drawable.grocery),
            CategoriesModel("Home",R.drawable.home),
            CategoriesModel("Toys",R.drawable.toys),
            CategoriesModel("Smartphone", R.drawable.smartphone),
            CategoriesModel("Smart TV", R.drawable.smarttv),
            )
    }

    fun loadSpinwin():List<SpinwinModel>{
        return listOf<SpinwinModel>(
            SpinwinModel(R.drawable.spinwin1),
            SpinwinModel(R.drawable.spinwin2),
            SpinwinModel(R.drawable.spinwin3),
            SpinwinModel(R.drawable.spinwin4)

        )
    }
}
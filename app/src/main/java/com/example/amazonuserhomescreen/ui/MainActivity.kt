package com.example.amazonuserhomescreen.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.amazonuserhomescreen.R
import com.example.amazonuserhomescreen.adapter.ItemAdapter
import com.example.amazonuserhomescreen.adapter.SpinItemAdapter
import com.example.amazonuserhomescreen.data.CategoryDataSource
import com.example.amazonuserhomescreen.data.MainRepository
import com.example.amazonuserhomescreen.data.remote.RandomUserApi
import com.example.amazonuserhomescreen.databinding.ActivityMainBinding
import com.example.amazonuserhomescreen.viewmodel.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.userDetails.observe(this) {
            binding.nameUser.text = it.results?.get(0)?.name?.first + " - "
            binding.userCity.text = it.results?.get(0)?.location?.street.name
            binding.postCode.text = it.results?.get(0)?.location?.postcode.toString()
        }

        binding.buttonRefresh.setOnClickListener {
            MainScope().launch {
                val data = MainRepository().getUserDetails()
                binding.nameUser.text = data?.results?.get(0)?.name?.first + " - "
                binding.userCity.text = data?.results?.get(0)?.location?.street?.name
                binding.postCode.text = data?.results?.get(0)?.location?.postcode.toString()
            }
            }

        val recyclerViewData = CategoryDataSource().loadCategories()
        binding.recyclerView.adapter = ItemAdapter(recyclerViewData)

        val recyclerViewDataSpin = CategoryDataSource().loadSpinwin()
        binding.recyclerView2.adapter = SpinItemAdapter(recyclerViewDataSpin)

        }
    }

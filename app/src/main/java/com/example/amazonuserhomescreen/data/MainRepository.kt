package com.example.amazonuserhomescreen.data

import com.example.amazonuserhomescreen.data.remote.RandomUserApi
import com.example.amazonuserhomescreen.data.remote.RetrofitInstance
import com.example.amazonuserhomescreen.datamodel.DatamodelUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepository {

    val randomUserApi = RetrofitInstance.getInstance().create(RandomUserApi::class.java)

    suspend fun getUserDetails(): DatamodelUser? {
        return withContext(Dispatchers.IO) {
            var result = randomUserApi.getData()
            result.body()
        }
    }
}


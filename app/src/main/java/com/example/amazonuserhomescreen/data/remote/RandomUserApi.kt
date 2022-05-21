package com.example.amazonuserhomescreen.data.remote
import retrofit2.Response
import retrofit2.http.GET
import com.example.amazonuserhomescreen.datamodel.DatamodelUser

interface RandomUserApi {

    @GET("https://randomuser.me/api/")
    suspend fun getData():Response<DatamodelUser>

}
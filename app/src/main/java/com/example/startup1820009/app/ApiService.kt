package com.example.startup1820009.app

import com.example.startup1820009.model.BarangModel
import com.example.startup1820009.model.ResponseModel

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("tblproduk/save")
    fun saveBarang (
        @Body data: BarangModel,
        ): Call<ResponseModel>

    @GET("barang")

    fun getBarang():Call<ResponseModel>

}
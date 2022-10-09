package com.example.dogapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by Oscar Arce
 * on 21/09/2022.
 */
interface APIService {
    @GET
    fun getCharacterByName(@Url url: String) : Call<DogsResponse>
}
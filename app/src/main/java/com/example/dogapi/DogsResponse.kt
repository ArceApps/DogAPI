package com.example.dogapi

import com.google.gson.annotations.SerializedName

/**
 * Created by Oscar Arce
 * on 21/09/2022.
 */
data class DogsResponse(@SerializedName("status") var status : String, @SerializedName("message") var images : List<String>)

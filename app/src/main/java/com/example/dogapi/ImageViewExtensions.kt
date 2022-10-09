package com.example.dogapi

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by Oscar Arce
 * on 22/09/2022.
 */
    fun ImageView.fromUrl(url:String){
        Picasso.get().load(url).into(this)
    }

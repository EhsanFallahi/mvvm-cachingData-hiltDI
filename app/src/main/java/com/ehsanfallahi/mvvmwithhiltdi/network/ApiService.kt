package com.ehsanfallahi.mvvmwithhiltdi.network

import retrofit2.http.GET

//url:https://open-api.xyz/placeholder/blogs

interface ApiService {
    @GET("blogs")
    suspend fun get():List<BlogNetworkEntity>
}
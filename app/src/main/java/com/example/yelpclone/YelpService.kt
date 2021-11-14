package com.example.yelpclone

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.GET
import retrofit2.http.Query

public interface YelpService {

    @GET("businesses/search")
    fun searchRestaraunts(
        @Query("term") searchTerm: String,
        @Query("location") location: String) : Call<Any>
}
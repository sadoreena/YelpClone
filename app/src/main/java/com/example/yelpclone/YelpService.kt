package com.example.yelpclone

import retrofit2.Call
import retrofit2.http.*

public interface YelpService {

    @GET("businesses/search")
    fun searchRestaraunts(
        @Header("Authorization") authHeader: String,
        @Query("term") searchTerm: String,
        @Query("location") location: String) : Call<YelpSearchResult>
}
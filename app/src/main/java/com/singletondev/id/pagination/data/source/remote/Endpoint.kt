package com.singletondev.id.pagination.data.source.remote

import com.singletondev.id.pagination.data.model.BaseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface Endpoint {

    @GET("/search")
    fun getNewsApi(
        @Query("api-key") apiKey : String
    ) : Single<BaseModel>
}
package com.singletondev.id.pagination.data.source.remote

import com.singletondev.id.pagination.base.BaseApiModel
import com.singletondev.id.pagination.data.model.Article
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface Endpoint {

    @GET("/v2/top-headlines")
    fun getNewsApi(
        @Query("country") country : String,
        @Query("apiKey") apiKey : String
    ) : Single<BaseApiModel<Article>>
}
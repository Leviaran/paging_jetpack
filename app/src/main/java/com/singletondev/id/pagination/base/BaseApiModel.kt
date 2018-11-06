package com.singletondev.id.pagination.base

import com.google.gson.annotations.SerializedName
import com.singletondev.id.pagination.data.model.Article

data class BaseApiModel <T>(
    @SerializedName("articles")
    val articles: List<T>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)
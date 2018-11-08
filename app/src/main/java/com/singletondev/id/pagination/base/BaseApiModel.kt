package com.singletondev.id.pagination.base

import com.google.gson.annotations.SerializedName
import com.singletondev.id.pagination.data.model.Result

data class BaseApiModel <T>(
    @SerializedName("currentPage")
    val currentPage: Int,
    @SerializedName("orderBy")
    val orderBy: String,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("results")
    val results: List<T>,
    @SerializedName("startIndex")
    val startIndex: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("total")
    val total: Int,
    @SerializedName("userTier")
    val userTier: String
)
package com.singletondev.id.pagination.data.model

import com.google.gson.annotations.SerializedName

data class BaseModel(
    @SerializedName("response")
    val response: Response
)
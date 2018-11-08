package com.singletondev.id.pagination.data.model

import com.google.gson.annotations.SerializedName
import com.singletondev.id.pagination.base.BaseApiModel

data class Response(
    @SerializedName("response")
    val response: BaseApiModel<Unit>
)
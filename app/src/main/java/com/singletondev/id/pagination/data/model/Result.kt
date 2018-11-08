package com.singletondev.id.pagination.data.model

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.util.DiffUtil
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("apiUrl")
    val apiUrl: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("isHosted")
    val isHosted: Boolean,
    @SerializedName("pillarId")
    val pillarId: String,
    @SerializedName("pillarName")
    val pillarName: String,
    @SerializedName("sectionId")
    val sectionId: String,
    @SerializedName("sectionName")
    val sectionName: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("webPublicationDate")
    val webPublicationDate: String,
    @SerializedName("webTitle")
    val webTitle: String,
    @SerializedName("webUrl")
    val webUrl: String
){
    companion object {

        var DIFFUTIL_CALLBACK = object : DiffUtil.ItemCallback<Result>() {

            override fun areItemsTheSame(p0: Result, p1: Result): Boolean {
                return p0.id == p1.id
            }

            override fun areContentsTheSame(p0: Result, p1: Result): Boolean {
                return p0.id == p1.id
            }
        }

    }
}
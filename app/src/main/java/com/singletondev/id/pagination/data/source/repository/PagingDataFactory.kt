package com.singletondev.id.pagination.data.source.repository

import android.arch.lifecycle.MutableLiveData
import android.arch.paging.DataSource
import com.singletondev.id.pagination.data.model.Result
import javax.inject.Inject

class PagingDataFactory @Inject constructor(
    val infinityDataSource : PagingDataSource
) : DataSource.Factory<Long, Result>(){
    val mutableLiveData = MutableLiveData<PagingDataSource>()

    override fun create(): DataSource<Long, Result> {
        mutableLiveData.postValue(infinityDataSource)
        return infinityDataSource
    }

}
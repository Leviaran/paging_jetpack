package com.singletondev.id.pagination.mvvm.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.singletondev.id.pagination.data.model.Result
import com.singletondev.id.pagination.data.source.repository.PagingDataFactory
import com.singletondev.id.pagination.utils.NetworkState
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Inject

class PaginViewModel @Inject constructor(val pagingDataFactory : PagingDataFactory) : ViewModel() {

    private lateinit var networkState : LiveData<NetworkState>
    private lateinit var articleLiveData : LiveData<PagedList<Result>>
    private lateinit var executor : Executor

    private fun initData(){

        executor = Executors.newFixedThreadPool(5)

        networkState = Transformations.switchMap(pagingDataFactory.mutableLiveData){
            it.networkState
        }

        val pageListConfig = (PagedList.Config.Builder())
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(10)
            .setPageSize(10).build()

        articleLiveData = (LivePagedListBuilder(pagingDataFactory, pageListConfig))
            .setFetchExecutor(executor)
            .build()

    }

}
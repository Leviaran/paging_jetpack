package com.singletondev.id.pagination.data.source.repository

import android.arch.lifecycle.MutableLiveData
import android.arch.paging.PageKeyedDataSource
import com.singletondev.id.pagination.data.model.Article
import com.singletondev.id.pagination.data.source.remote.Endpoint
import com.singletondev.id.pagination.utils.NetworkState
import javax.inject.Inject

class PagingDataSource @Inject constructor(val apiService : Endpoint) : PageKeyedDataSource<Long, Article>(){

    var initialState = MutableLiveData<NetworkState>()
    var networkState = MutableLiveData<NetworkState>()

    override fun loadInitial(params: LoadInitialParams<Long>, callback: LoadInitialCallback<Long, Article>) {
        initialState.postValue(NetworkState.LOADING)
        networkState.postValue(NetworkState.LOADING)

//        apiService.getNewsApi("id", )
    }

    override fun loadAfter(params: LoadParams<Long>, callback: LoadCallback<Long, Article>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBefore(params: LoadParams<Long>, callback: LoadCallback<Long, Article>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
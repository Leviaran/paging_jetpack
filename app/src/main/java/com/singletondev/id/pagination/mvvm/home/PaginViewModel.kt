package com.singletondev.id.pagination.mvvm.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.singletondev.id.pagination.data.model.Result
//import com.singletondev.id.pagination.data.source.repository.PagingDataFactory
import com.singletondev.id.pagination.utils.NetworkState
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Inject

//class PaginViewModel @Inject constructor(val pagingDataFactory : PagingDataFactory) : ViewModel() {
//
//     lateinit var networkState : LiveData<NetworkState>
//     lateinit var articleLiveData : LiveData<PagedList<Result>>
//    private lateinit var executor : Executor
//
//    fun start(){
//        initData()
//    }
//
//    //TODO create networkState Transformation.switmap,LivedPagedListBuilder  and create pageLIstConfig
//    private fun initData(){
//
//
//
//    }
//
//}